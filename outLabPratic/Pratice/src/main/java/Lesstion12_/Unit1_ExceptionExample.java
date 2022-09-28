package Lesstion12_;

import java.util.Scanner;

public class Unit1_ExceptionExample {
    public static void main(String[] args) {
        //        System.out.println("Case 1: perform with devision by zero ");
        //        int number1 = 9;
        //        int number2 = 0;
        //            System.out.println(number1 / number2);
        //        **********************************************************************************
                /*

                Lỗi ArithmeticException là các lỗi về toán học
                 */
        //        System.out.println("Case2: perform with String null");
        //   String str = null;
        //        System.out.println(str.length() );
                    /*
                    Các ngoại lệ với chuỗi thì điển hình là lỗi NullPointerException, do ta thao tác với các chuỗi rỗng
                    Các trường hợp gặp phải lỗi này:
                    1, sử dụng phương thức charAt của String  vào vị trí chứa giá trị null
                    2, ta bắt chuỗi không chuẩn
                    **********************************************************************************
                     */

        //    String str1 = "abc";
        //int number = Integer.parseInt(str1);
        //        System.out.println(number);
                        /*
                        Nếu bài toán chỉ đơn giản như trên thì không có vấn đề gì
                         nhưng giả sử ta thay giá trị truyền vào không phải dạng số mà là chữ thì sẽ có lỗi
                        "NumberFormatException" xảy ra khi chúng ta ép kiểu mà nó bị sai
                         */

        //        int[] arr = new int[5];
        //        arr[5] = 10;
                /*
                Ngoại lệ tiếp theo khi ta thao tác với mảng và truyền giá trị tại vị trí ngoaì mảng đã cho thì sẽ xuất hiện lỗi
                ArrayIndexOutOfBoundException
                 */

        System.out.println("input: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        /*
        Khi chương trình có đầu vào cần nhập một số từ bàn phím vào mà ta lại nhập chữ thì sẽ sinh lỗi
        InputMismatchException
         */
        //        **********************************************************************************
        //        int[] array = new int[-5];
                /*
                Ngoại lệ tiếp theo, kích thước mảng là một số âm thì sẽ xuất hiện lỗi
                NegativeArraySizeException
                 */

    }
}
