package Lesstion12_;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
bài toán đặt ra là khi cho một chỉ số BMI thì ta sẽ có một công thức tính cần chèn cân nặng và chiều cao chắc chắn phải  lớn hơn 0
vấn đề đặt ra là khi ta nhập chiều cao vào thì có thể sẽ nhập sai thành chữ hoặc số <=0 nên ta phải để trước một ngoại lệ như vậy.
 */
public class Unit4_Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            try {
                double height =inputWithCheckedException();
                System.out.println(height);
                flag = false;
            }
            catch (Unit4_MyCustomCheckedException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại");
            } catch (InputMismatchException e) {
                System.out.println("nhập sai kiểu");
                System.out.println("vui lòng nhập lại");
            }catch (NumberFormatException e){
                System.out.println("nhập sai kiểu");
                System.out.println("vui lòng nhập lại");
            }
        }
    }

    // Unchecked Exception
    public static double inputWithUnCheckedException() {
        System.out.println("Nhập vào chiều cao");
        double height = scan.nextDouble();
        if (height <= 0 || height > 3.0) throw new Unit4_MyCustomUnCheckedException("đầu vào không hợp lệ");
        return height;
    }

//    public static double inputWithCheckedException(){
////     throws Unit4_MyCustomCheckedException, InputMismatchException{
//        /*
//            Nếu ta không khai báo ngoại lệ thì ta sẽ phải triển khai gắn try-catch trong hàm con
//         */
//        boolean flag = true;
//        double height =0;
//        while (flag){
//            System.out.println("Nhập vào chiều cao");
//             height = scan.nextDouble();
//            try{
//                if (height <= 0 || height > 3.0)
//                    throw new Unit4_MyCustomCheckedException("đầu vào không hợp lệ");
//            }catch (Unit4_MyCustomCheckedException e){
//                System.out.println("in sai roi");
//            }
//        }
//        return height;
//    }
    public static double inputWithCheckedException()throws Unit4_MyCustomCheckedException, InputMismatchException,NumberFormatException{
        /*
            Nếu ta không khai báo ngoại lệ thì ta sẽ phải triển khai gắn try-catch trong hàm con
         */
        boolean flag = true;
        double height =0;
        while (flag){
            System.out.println("Nhập vào chiều cao");
            height =Double.parseDouble(scan.nextLine());
                if (height <= 0 || height > 3.0)
                    throw new Unit4_MyCustomCheckedException("đầu vào không hợp lệ");
        }
        return height;
    }

}

