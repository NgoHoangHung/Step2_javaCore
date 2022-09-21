package Lession11_InterfaceAnotation;
// Để việc so sánh các biến kiểu dữ liệu nhân tạo trở nên thuận lợi ta có thể ghi lại phương thức compareTo()
public class Unit1_UserVarable implements Comparable <Unit1_UserVarable>   {
    private String name;
    private int age;
    private String address;

    public Unit1_UserVarable(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Unit1_UserVarable{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", address='" + getAddress() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Unit1_UserVarable o) {
        return this.getName().compareTo(o.getName());
    }
}
/*
Comparable interface sử dụng để sắp xếp các đối tượng của lớp do người dùng từ định nghĩa.

Trong interface này chỉ có duy nhất một phương thức là compareTo(), phương thức này được sử dụng để sắp xếp đối tượng hiện tạo với đối tượng được chỉ định

Giờ mình sẽ áp dung để sắp xếp danh sách học sinh theo tên:

public class Student implements Comparable<Student>{
    private String name;
    private double point;

    public Student(String name, double point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", point=" + point +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
       ArrayList<Student> students = new ArrayList<>();
       students.add(new Student("John", 8.5));
       students.add(new Student("Anna", 9));
       students.add(new Student("Victor", 7));
       students.add(new Student("Chris", 6.5));

        System.out.println("Danh sách học sinh: ");
        show(students);

        Collections.sort(students);
        System.out.println("Danh sách sau khi sắp xếp: ");
        show(students);
    }

    public static void show(ArrayList<Student> list){
        for (Student student: list) {
            System.out.println(student);
        }
    }
}

Kết quả nhận được:

Danh sách học sinh:
Student{name='John', point=8.5}
Student{name='Anna', point=9.0}
Student{name='Victor', point=7.0}
Student{name='Chris', point=6.5}
Danh sách sau khi sắp xếp:
Student{name='Anna', point=9.0}
Student{name='Chris', point=6.5}
Student{name='John', point=8.5}
Student{name='Victor', point=7.0}

Có thể thấy danh sách được sắp xếp theo tên
 */