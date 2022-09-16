package Unit5;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Manager stdManagerObj = new Manager();

    public static void main(String[] args) {
        boolean flag = true;
        int funtionID;
        do {
            showMenu();
            funtionID = scanner.nextInt();
            switch (funtionID){
                case 1: add(); break;
                case 2: edit(); break;
                case 3: delete(); break;
                case 4: find(); break;
                case 5: display(); break;
                case 6: exit(); break;
                default:
                    flag = false;
            }

        }while(flag);
    }

    public static void print(String string){
        System.out.println(string);
    }

    public static void showMenu(){
        print("________________________Menu_______________________");
        print("1, Thêm mới học sinh");
        print("2, Sửa danh sách học sinh");
        print("3, Xóa học sinh");
        print("4, Tìm kiếm");
        print("5, Hiển thị thông tin học sinh");
        print("6,Thoát");
        print("Lụa chọn tính năng:");
    }

    public static void add(){
        System.out.println("Nhập tên học sinh");
        String name= scanner.nextLine();
        scanner.nextLine();
        print("Nhập số tuổi:");
        int age = scanner.nextInt();
        print("Nhập quê quán");
        String town = scanner.nextLine();
        scanner.nextLine();

        print("Nhập lớp học:");
        String studentClass = scanner.nextLine();

        StudentManager stdManager = new StudentManager(name,age,town,studentClass);
        stdManagerObj.add(stdManager);
    }

    public static void edit(){
        System.out.println("Main.edit");
    }
    public static void delete(){
        System.out.println("Main.delete");
    }
    public static void find(){
        System.out.println("Main.find");
    }
    public static void display(){
        stdManagerObj.display();
    }
    public static void exit(){
        System.out.println("Main.exit");
    }
}
