package Lesstion12_Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/*
Việc chuyển đổi một file json sang một arraylist thì cũng xuất phát từ việc đọc một file json.
ta có thể đưa hết toàn bộ dữ liệu vào Arraylist
Nhiều khi ta đưa vào ArrayList thì các công việc như là sắp xếp, thêm sửa xóa sẽ dễ hơn rất nhiều
 */
public class Lession5_JsonToArraylist {
    public static void main(String[] args) {
        Gson gson = new Gson();

        for (Lession3_Person arg : jsonToArrayList(gson)) {
            System.out.println(arg.toString());
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }

public static ArrayList<Lession3_Person> jsonToArrayList(Gson gson){
    ArrayList<Lession3_Person> listObj = new ArrayList<>();
// để lấy dữ liệu ra thì ta cũng sẽ sử dụng cái file là FileReader
    {
        try {
            FileReader reader = new FileReader("person.json");
            /*
            chuyển từ json sang arraylist thì ta phải lấy được cái type của dữ liệu
             để gson hiểu được cái cấu trúc của ArrayList thì ta cần phải trỏ tới cái   kiểu dữ liệu của ArrayList đó
              và ta sử dụng phương thức là TypeToken
             */
            Type type = new TypeToken<ArrayList<Lession3_Person>>() {
            }.getType();

            listObj = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
//            for (Lession3_Person person : listObj) {
//                System.out.println(person.toString());
//                System.out.println("________________________________");
//            }
    }
    return listObj;
}}
