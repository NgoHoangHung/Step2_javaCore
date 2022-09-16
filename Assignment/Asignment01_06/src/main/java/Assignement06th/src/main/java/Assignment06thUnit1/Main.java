package Assignment06thUnit1;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        do {
            showMenu();
            int funtionID = sc.nextInt();
            switch (funtionID) {
                case 1:
                    creat();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                default: {
                    flag = false;
                    myprint("end");
                }
            }
        } while (flag);
    }

    public static void showMenu() {
        myprint("==============Library Manager==============");
        myprint("1. Creat New Customer Card");
        myprint("2. Read Customer Card");
        myprint("3. Update Customer Card");
        myprint("4. Delete Customer Card");
        myprint("5. Exit");
        myprint("Choose Option:");
    }

    public static void myprint(String content) {
        System.out.println(content);
    }

    public static void creat() {
        myprint("Card Code Input:");
        String numberCode = sc.nextLine();
        sc.nextLine();
        myprint("borrowed date input:");
        String borrowedDate = sc.nextLine();
        sc.nextLine();
        myprint("Deadline Date Input:");
        String deadlineDate = sc.nextLine();
        sc.nextLine();
        myprint("Book ID Input: ");
        String bookID = sc.nextLine();
        sc.nextLine();
        myprint("Student Info Input:");
        myprint("Name Input:");
        String name = sc.nextLine();
        sc.nextLine();
        myprint("Age Input:");
        int age = sc.nextInt();
        myprint("Class Input: ");
        String classID = sc.nextLine();
        sc.nextLine();
        StudentManager studenObj = new StudentManager(name, age, classID);
        Card cardObj = new Card(numberCode, borrowedDate, deadlineDate, bookID, studenObj);
        CardManager cardManagerObj = new CardManager();
        cardManagerObj.creat(cardObj);
    }

    public static void read() {
        System.out.println("Main.read");
    }

    public static void update() {
        System.out.println("Main.update");
    }

    public static void delete() {
        System.out.println("Main.delete");
    }
}
