import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        unit1a();
//        unit1b();
        unit2a(5);
    }

    public static void unit1a() {
        boolean flag = true;
        while (flag) {
            try {

                System.out.print("nhập vào số thứ nhất: ");
                double number1 = Double.parseDouble(scan.nextLine());
                System.out.print("nhập vào số thứ hai: ");
                double number2 = Double.parseDouble(scan.nextLine());
                System.out.println("gút chóp");
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Nhập đầu vào sai kiểu.");
                System.out.println("Nhập lại");
            } catch (InputMismatchException e) {
                System.out.println("Nhập đầu vào sai kiểu.");
                System.out.println("Nhập lại");
            }
        }
    }

    public static void unit1b() {
        int number1 = 0;
        int number2 = 0;
        try {
            System.out.print("nhập vào số thứ nhất: ");
            number1 = Integer.parseInt(scan.nextLine());
            System.out.print("nhập vào số thứ hai: ");
            number2 = Integer.parseInt(scan.nextLine());
            System.out.println(number1 / number2);

            if (number2 == 0) throw new ArithmeticException() {
            };
        } catch (NumberFormatException e) {
            System.out.println("Nhập đầu vào sai kiểu.");
        } catch (InputMismatchException e) {
            System.out.println("Nhập đầu vào sai kiểu.");
        } catch (ArithmeticException e) {
            System.out.println("không chia được");
        }
    }

    public static void unit2a(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            try {
                System.out.printf("array[%d] = ", i);
                array[i] = Integer.parseInt(scan.nextLine());
                if (array[i] == 100) throw new CustomException("Lỗi 100");
            } catch (CustomException e) {
                System.out.println("in mảng");
                for (int j = 0; j <i; j++) {
                    System.out.println(array[j]);
                }
                System.out.printf("hàm dừng tại vị trí thứ %d",i+1);
                break;
            }
        }
    }
}

