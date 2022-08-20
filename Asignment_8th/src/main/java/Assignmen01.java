public class Assignmen01 {
    /* bài 1
    int i = 10;
    int n = i++%5;
    a. Hãy in ra giá trị cuối cùng của 2 biến i và n.
b. Nếu thay phép toán tăng i++ (postfix increment operator) bằng ++i (prefix increment operator)
thì giá trị cuối cùng của i và n là bao nhiêu?
     */
    public static void main(String[] args) {
        System.out.println("Bài 1a: Giá trị cuối cùng ta thu được n = " + bai1a(10));
        System.out.println("Bài 1b: Giá trị cuối cùng ta thu được n = " + bai1b(10));
        System.out.println("Bài 2: Giá trị thu được chuyển từ độ F sang độ C là: " + fDegreeToCDegree(77));
        System.out.println(9/5);
        System.out.println("Bài 3: Giá trị của d sau khi ép kiểu: " + bai3a(9,5));

    }

    public static int bai1a(int i) {
        int n = i++ % 5;
        System.out.println("giá trị của i = " + i);
        return n;
    }
    public static int bai1b(int i){
        int n = ++i%5;
        System.out.println("giá trị của i = " + i);
        return n;
    }
    public static double fDegreeToCDegree(double F){
        return Math.floor((F-32)/1.8);
    }

    public static double bai3a(int x , int y){
        return (double)x/y;
    }
}


















