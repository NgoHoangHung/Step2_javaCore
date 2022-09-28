package Lession12_Exception;

public class Unit4_MyCustomCheckedException extends Exception    {
    public Unit4_MyCustomCheckedException(String message) {
        super(message);
    }
}
/*
Mỗi khi có một khai báo phương thức con  thì với Checked Eception thì hệ thống sẽ cảnh báo ta luôn rằng
cần phải thêm lệnh try-catch ngay sau đoạn ta nghi ngờ có lỗi xảy ra(trong method)
Để tránh việc này xảy ra thì ta sẽ khai báo luôn ngay sau khi viết khai báo hàm con.
ta sẽ chỉ cần đặt khối try-catch tại mỗi lần sử dụng phương thức đó mà thôi.
 */