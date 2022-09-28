package Lession11_Gson;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lession4_JsonToJavaObjArray {
    public static void main(String[] args) {
        Gson gson = new Gson();


        System.out.println("___________________JavaObjArrayToJson___________________");
        Lession3_Person[] arrayPerson = new Lession3_Person[3];
        arrayPerson[0] = new Lession3_Person("hung", "nhhung125@gmail.com", "0362997999");
        arrayPerson[1] = new Lession3_Person("tien", "tiendinh@gmail.com", "0345455454");
        arrayPerson[2] = new Lession3_Person("tho", "buitho@gmail.com", "0362785499");
        String json = gson.toJson(arrayPerson, Lession3_Person[].class);
        System.out.println(json);
        System.out.println("_______________________________");

        //khi ta muốn lưu đoạn text json ra một file thì ta có thể sử dụng  cấu trúc JsonWriter
        try {
            FileWriter fileWriter = new FileWriter("dataIO.json");
            JsonWriter writer = new JsonWriter(fileWriter);
            /*
            Cấu trúc của một file writer luôn bắt đầu bằng một mảng nên là ta sẽ sử dụng một phương thức beginArray
            Để tránh cho việc các phần tử cùng nằm trên một hàng ta sẽ sử dụng sout để ngăn cách nó
             */
            writer.beginArray();
            for (Lession3_Person person : arrayPerson) {
                //Mỗi một dữ liệu hay có thể gọi là mỗi một dữ liệu person là một  đối tượng nên là  sẽ sử dụng phương thức beginOject và endObject
                writer.beginObject();
                writer.name("full_name").value(person.getFullname());
                writer.name("Email").value(person.getEmail());
                writer.name("numberphone").value(person.getMobile());
                writer.endObject();
            }
            writer.endArray();
            //xong xuôi tất cả thì sẽ sử dụng phương thức đóng. chỉ có như vậy thì dữ liệu mới được đẩy vào trong file dataIO.json
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("___________________JsonToJavaObjArray___________________");
        for (Lession3_Person person : Person(gson)) {
            System.out.println(person.toString());
            System.out.println("_____________________________");
        }

    }

    public static Lession3_Person[] Person(Gson gson) {
        Lession3_Person[] arrPerson = null;
        //sử dụng Findreader để có thể đọc được các file kiểu json này
        try {
            FileReader reader = new FileReader("person.json");
            arrPerson = gson.fromJson(reader, Lession3_Person[].class);
            // Sau khi lấy được dữ liệu cho vào trong array Person thì ta sẽ đóng nó lại
            //sau đấy nó sẽ bắt ta phải thêm một cái catch (IOException ) nữa vào
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            throw new RuntimeException();
        }
//        for (Lession3_Person person : arrPerson) {
//            System.out.println(person.getFullname() + "\n" + person.getEmail() + "\n" + person.getMobile() + "\n___________________________________ " );
//        }
        return arrPerson;
    }
}
