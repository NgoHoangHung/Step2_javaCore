package Assignment05On12th;
import java.util.Scanner;

public class main {
         public static Scanner sc = new Scanner(System.in);
         public static QuanLiCanBo qlcbObj = new QuanLiCanBo();
    public static void main(String[] args) {
         boolean flagEntry = true;
         int funtionID = 0;
         do{
             showMenu();
             funtionID = sc.nextInt();
             sc.nextLine();
             switch(funtionID){
                 case 1: addEmploy(); break;
                 case 2: findEmployee(); break;
                 case 3: infoEmployee(); break;
                 case 4:
                 default:
                     flagEntry=false;
                     System.out.println("end");
                     break;
             }
         }while(flagEntry);
    }

    public static void showMenu(){
        System.out.println("=========================Employee Manager============================");
        System.out.println("1. Add Employee");
        System.out.println("2. Find Employee");
        System.out.println("3. Info Employee");
        System.out.println("4. Exit");
    }
    public static void addEmploy(){
        System.out.println("Tên mới: ");
        String nameTmp = sc.nextLine();
        System.out.println("Tuổi:");
        int     ageTmp= sc.nextInt();
        sc.nextLine();
        System.out.println("giới tính: ");
        String genderTmp = sc.nextLine();
        System.out.println("Địa chỉ: ");
        String addressTmp = sc.nextLine();
        CanBo canboObj = new CanBo(nameTmp,ageTmp,genderTmp,addressTmp);
        qlcbObj.add(canboObj);
    }
    public static void findEmployee(){

        System.out.println("Nhập tên cán bộ cần tìm kiếm");
        String name = sc.nextLine();
        qlcbObj.findEmployee(name);
    }
    public static void infoEmployee(){
        qlcbObj.infoEmployee();

    }
    public static void Exit(){
        System.out.println("main.Exit");
    }
}
