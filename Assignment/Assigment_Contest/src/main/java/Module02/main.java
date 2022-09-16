package Module02;

import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static QuanLiHocSinh qlhsObj  = new QuanLiHocSinh();
    public static void main(String[] args) {
        boolean flag = true;
        do{
            showMenu();
        int funtionID = sc.nextInt();
        switch (funtionID){
            case 1: add(); break;
            case 2: edit(); break;
            case 3: delete(); break;
            case 4: find(); break;
            case 5: showAll(); break;
            case 6: showFollowAge(); break;
            case 7: showFollowHomeTown(); break;
            case 8:
            default:{
                flag=false;
                    break;
            }
        }
        }while(flag);

    }

    public static void showMenu(){
        System.out.println("_____________________Quản lí học sinh__________________");
        System.out.println("1, Thêm học sinh");
        System.out.println("2, Sửa thông tin học sinh");
        System.out.println("3, Xóa học sinh");
        System.out.println("4, Tìm kiếm học sinh");
        System.out.println("5, Hiển thị thông tin học sinh");
        System.out.println("6, Hiển thị thông tin học sinh 20 tuổi");
        System.out.println("7, Hiển thị thông tin học sinh 23 tuổi và quê ở Đà Nẵng ");
        System.out.println("8, Thoát hàm quản lí ");
        System.out.println("Lựa chọn chức năng");
    }
    public static void add(){
        Scanner sc = new Scanner(System.in);
//        String name ="";
//        int age = 0;
//        String homeTown="";
//        String studentClass = "";
        System.out.println("Nhập tên học sinh");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi học sinh");
         int age =Integer.parseInt(sc.nextLine());
        System.out.println("Nhập quê quán học sinh");
        String homeTown = sc.nextLine();
        System.out.println("Nhập lớp của học sinh");
         String studentClass = sc.nextLine();
        LopHoc classObj = new LopHoc(name,age,homeTown,studentClass);
        qlhsObj.add(classObj);
    }
    public static void edit(){
        System.out.println("main.edit");
    }
    public static void delete(){
        System.out.println("main.delete");
    }
    public static void find(){
        System.out.println("main.find");
    }
    public static void showAll(){
        qlhsObj.showInfo();
    }
    public static void showFollowAge(){
        qlhsObj.showInfoAge();
    }
    public static void showFollowHomeTown(){
        qlhsObj.showInfoAgeHomeTown();
    }
    public static void exit(){
        System.out.println("main.exit");
    }
}
