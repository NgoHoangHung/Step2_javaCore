package Lesstion12_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unit2_ResolveExceptionWithTryCatchFinally {
    public static void main(String[] args) {
//                try{
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Input1:");
//                int number1 = scan.nextInt();
//        System.out.println("Input2:");
//                int number2 = scan.nextInt();
//                    System.out.println(number1 / number2);
//                }catch(ArithmeticException mathError) {
//                    System.out.println("Error Division by zero");
//                }catch(InputMismatchException inputError){
//                    System.out.println("Input Error");
//                }
                /*
                khi ta nhập sai kiểu thì sẽ xuất hiện lỗi InputMismatchException
                để khắc phục điều này thì ta cho khối scan vào trong lệnh try catch
                để chương trình bắt lỗi. tuy nhiên, khi đó nó chỉ bắt được theo mỗi lệnh catch Exception
                mà không có lỗi catch riêng cho nó. Chính vì vậy, với hai lỗi"nhập sai kiểu"
                và "lỗi chia cho 0" thì ta sẽ tạo ra 2 lỗi cho catch bắt lại
                 */
        boolean flagCheckException = true;
        while(flagCheckException){

        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Input1:");
            int number1 = scan.nextInt();
            System.out.println("Input2:");
            int number2 = scan.nextInt();
            System.out.println(number1 / number2);
            scan.nextLine();
            flagCheckException = false;
        }catch(ArithmeticException mathError) {
            System.out.println("Error Division by zero");
        }catch(InputMismatchException inputError){
            System.out.println("Input Error");
        }finally{
            System.out.println("Khối này luôn được thực thi");
        }
        }

/*
Tiếp theo ta có khối finally thì khối này luôn luôn được thực thi kể cả có ngoại lệ hay không có ngoại lê xảy ra.
Khối này nó sẽ thực thi đoạn mã hay  các lệnh quan trọng của chương trình
khối finally hay được sử dụng khi ta đóng scanner
hoặc khi ta mở file thì ta sẽ phải đóng nó lại
hoặc khi đang kết nối tới database thì khi đã có kết nối rồi thì ta phải đóng cái kết nối ấy lại ms có thể đọc được.

Luồng chương trình luôn chạy đến khi gặp lỗi thì
trường hợp trên thì khi ta muốn nhập lại dữ liệu thì ta sẽ để một vòng lặp while ở bên ngoài cùng một cờ check.
khi nào nhập đúng, không bị sai câu lệnh thì cờ sẽ bật lên và ngừng chương trình.
 */
    }
}
