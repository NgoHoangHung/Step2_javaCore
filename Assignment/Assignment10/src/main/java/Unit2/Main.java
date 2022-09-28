package Unit2;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

    static Scanner sc = new Scanner(System.in);
    static AccountManager accManagerObj = new AccountManager();

        static boolean flagDisplay = true;
//    static HashMap<String,String> accountObj = new HashMap<>();
    public static void main(String[] args) {
        do {
        showFuntion();
            int funtion =Integer.parseInt(sc.nextLine());
            switch (funtion){
                case 1: logInBar(); break;
                case 2: signUpBar(); break;
                case 3: exit(); 
                default: flagDisplay = false;
            }
        }
        while (flagDisplay);
//        signinBar();
    }

    public static void showFuntion() {
        System.out.println("______________________Welcome To TechMaster______________________");
        System.out.println("1. Login");
        System.out.println("2. Sign Up");
        System.out.println("3. Exit");

        System.out.print("Choose Funtion:");
    }

    public static void signUpBar() {
//        System.out.println("Welcome to TechMaster!");
        String id = "";
        String password = "";
        System.out.println("________________Sign in________________");
        while (!id.matches("^[\\w\\S]{6,12}")) {
            System.out.print("ID: ");
            id = sc.nextLine();
            System.out.println();
        }
        while (!password.matches("^[\\w\\S]{8,15}")) {
            System.out.print("Password:");
            password = sc.nextLine();
            System.out.println();
        }
        Account account = new Account(id,password);
        accManagerObj.creat(account);
        System.out.println("Sign Up Success");
    }

    public static void logInBar() {
        String id = "";
        String password = "";
        System.out.print("ID: ");
        id = sc.nextLine();
        System.out.print("Password:");
        password = sc.nextLine();
        Account account = new Account(id,password);
        if(accManagerObj.checkAccount(account))
            System.out.println("Login Success");
        else
            System.out.println("Login Failed");
    }
    public static  void exit(){
        flagDisplay = false;
    }
}
