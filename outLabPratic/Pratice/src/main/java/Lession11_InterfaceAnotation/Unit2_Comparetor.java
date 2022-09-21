package Lession11_InterfaceAnotation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Unit2_Comparetor {
    public static void main(String[] args) {
        ArrayList<Unit1_UserVarable> userVarables = new ArrayList<>();
        userVarables.add(new Unit1_UserVarable("Ngoc", 21, "Hanoi"));
        userVarables.add(new Unit1_UserVarable("Thanh", 21, "Hanoi"));
        userVarables.add(new Unit1_UserVarable("Vuong", 22, "Hanoi"));
        userVarables.add(new Unit1_UserVarable("Hunh", 11, "Hanoi"));
        userVarables.add(new Unit1_UserVarable("Thu", 44, "Hanoi"));
        userVarables.add(new Unit1_UserVarable("Nam", 55, "Hanoi"));
        userVarables.add(new Unit1_UserVarable("Trung", 23, "Hanoi"));
        userVarables.add(new Unit1_UserVarable("Minh", 25, "Hanoi"));


        myprint(userVarables);
        Comparator<Unit1_UserVarable> comparator = new Comparator<Unit1_UserVarable>() {

            @Override
            public int compare(Unit1_UserVarable o1, Unit1_UserVarable o2) {
                int result = o1.getAge() - o2.getAge();
                if(result  == 0)
                    return o1.getName().compareTo(o2.getName());
                return result;
            }
        };

        System.out.println("Hiển thị ra kết quả tìm kiếm: ");
        Collections.sort(userVarables);
        myprint(userVarables);
    }

    public static void myprint(ArrayList<Unit1_UserVarable> userObj) {
        for (Unit1_UserVarable userVarable : userObj) {
            System.out.println("name: " + userVarable.getName() +
                    "\nage" + userVarable.getAge() +
                    "\naddress: " + userVarable.getAddress() + "\n___________________________________________\n");
        }
    }
}
/*
Một interface tiếp theo, được sử dụng để sắp xếp các kiểu dữ liệu do người dùng tự định nghĩa thì đó là Comparator. Khác với Comparable thì
Comparator nằm ở trong một lớp java.util.Comparator và có chứa hai phương thức là compare và equal. Đối với Comparator, ta không cần phải
implement từ interface gốc, mà ta có thể sử dụng trực tiếp để sắp xếp được
Ở đây, khi ta gọi đến phương thức sort nằm ở trong Collections, thì có một phương thức "sort" khác
để ta có thể truyền vào đối tượng đang tham chiếu và truyền bộ sắp xếp Comparator
public static <T> void sort(List<T> list, Comparator<? super T> c) {
        list.sort(c);
    }

    Ta bắt buộc phải override lại phương thức compare trong comparator
            Comparator<Unit1_UserVarable> comparator= new Comparator<Unit1_UserVarable>(){

            @Override
            public int compare(Unit1_UserVarable o1, Unit1_UserVarable o2) {
                return 0;
            }
        };
        Nếu muốn sắp xếp giảm dần thì sẽ return lại giá trị biến 1 - biến 2
        Nếu muốn sắp xếp tăng  dần thì sẽ return lại giá trị biến 2 - biến 1

        Trong bài trên, ta có một issue là sắp xếp người trong danh sách theo độ tuổi. và những người có tuổi bằng nhau thì lại sắp xếp theo tên.
 */