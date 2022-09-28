package Lession12_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unit3_ResolveExceptionWithThowThrows {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        if (setAge() > 18) {
            System.out.println("đủ tuổi bầu cử");
        } else System.out.println("chưa đủ tuổi bầu cử");

    }

    public static int setAge() throws InputMismatchException{
        int age = 0;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Nhập vào số tuổi: ");
//                age = Integer.parseInt(scan.nextLine());
                age = scan.nextInt();
                if (age < 0 || age > 130) {
                    throw new ArithmeticException();
                }
                flag = false;
            } catch (ArithmeticException e) {
                System.out.println("Không tồn tại người này");
                System.out.println("nhập lại");
            }catch(NumberFormatException e){
                System.out.println("nhập sai kiểu ");
                System.out.println("nhập lại");
            }
        }
        return age;
    }
}
/*
throw là từ khóa ném ra ngoại lệ còn thows là tạo ra một ngoại lệ ngay sau hàm chúng ta tạo.
việc đặt try-catch sau đó sẽ được đặt tại nơi gọi phương thức. việc dùng throws giúp ta có thể gán cho hàm nhiều ngoại lệ,
giúp ta linh động trong việc xử lí lỗi
throws hay sử dụng cho checked Exception trong việc đọc file
Điển hình nhất là khi ta sử dụng hàm đọc file là FileReader thì lúc nào cũng sẽ phải sử dụng hàm try-catch để bắt nó.
FileNotFoundException là file checked nên sẽ luôn có báo lỗi  đỏ và bắt buộc phải thêm khối try catch vào
 còn các phương thức đi kèm bắt lỗi unchecked thì dù
có ko đặt hàm try-catch vào phương thức nghi ngờ lỗi  thì nó cũng sẽ ko báo lỗi
 */