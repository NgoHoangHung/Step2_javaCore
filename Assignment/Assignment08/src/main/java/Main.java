import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static TeacherOfficerManager tomObj = new TeacherOfficerManager();

    public static void main(String[] args) {
        boolean flag = true;
        do {
            showMenu();
            int funtionId = sc.nextInt();
            sc.nextLine();
            switch (funtionId) {
                case 1:
                    creatMain();
                    break;
                case 2:
                    updateMain();
                    break;
                case 3:
                    requestMain();
                    break;
                case 4:
                    deleteMain();
                    break;
                case 5: showInfoMain(); break;
                case 6:
                default:
                    flag = false;
            }

        } while (flag);
    }

    public static void creatMain() {
        System.out.println("Nhập tên giáo viên: ");
        String name = sc.nextLine();
//        sc.nextLine();
        System.out.println("Nhập tuổi giáo viên: ");
        int age = Integer.parseInt(sc.nextLine());
//        sc.nextLine();
        System.out.println("Nhập quê quán giáo viên: ");
        String homeTown = sc.nextLine();
//        sc.nextLine();
        System.out.println("Nhập mã số giáo viên: ");
        String personIdentification = sc.nextLine();
//        sc.nextLine();
        System.out.println("Nhập lương cơ bản: ");
        int baseSalary = Integer.parseInt(sc.nextLine());
//        sc.nextLine();
        System.out.println("Nhập tiền thưởng: ");
        int bonusSalary =Integer.parseInt(sc.nextLine());
//        sc.nextLine();
        System.out.println("Nhập tiền phạt: ");
        int penatyMoney = Integer.parseInt(sc.nextLine());
//        sc.nextLine();
        TeacherOfficer toObj = new TeacherOfficer(name, age, homeTown, personIdentification, baseSalary, bonusSalary, penatyMoney);
        tomObj.creat(toObj);
    }

    public static void updateMain() {
    }

    public static void requestMain() {
        System.out.println("Nhập mã số nhân viên cần tìm: ");
        String ID = sc.nextLine();
        tomObj.request(ID);
    }

    public static void deleteMain() {
        System.out.println("Nhập mã số nhân viên cần xóa: ");
        String ID = sc.nextLine();
        tomObj.delete(ID);
    }
public static void showInfoMain(){
        tomObj.showInfo();
}
    public static void showMenu() {
        System.out.println("_______________________Teacher Manager App_______________________");
        System.out.println("1. Add Teacher");
        System.out.println("2. Edit Teacher");
        System.out.println("3. Find Teacher");
        System.out.println("4. Delete Teacher");
        System.out.println("5. Show Infor Teacher");
        System.out.println("6. Exit Teacher");
        System.out.print("Choose Funtion: ");
    }
}
