import java.time.LocalDateTime;
public class Assignmen01 {
    /* bài 1
    int i = 10;
    int n = i++%5;
    a. Hãy in ra giá trị cuối cùng của 2 biến i và n.
b. Nếu thay phép toán tăng i++ (postfix increment operator) bằng ++i (prefix increment operator)
thì giá trị cuối cùng của i và n là bao nhiêu?
     */
    public static void main(String[] args) {
//        Phần khai báo biến
        double randomNumber = Math.random();
        randomNumber = randomNumber * 1000;
        System.out.println(randomNumber);


        System.out.println("Bài 1a: Giá trị cuối cùng ta thu được n = " + bai1a(10));
        System.out.println("____________________Bài 1_______________________");
        System.out.println("Bài 1b: Giá trị cuối cùng ta thu được n = " + bai1b(10));
        System.out.println("____________________Bài 2________________________");
        System.out.println("Bài 2: Giá trị thu được chuyển từ độ F sang độ C là: " + fDegreeToCDegree(77));
        System.out.println(9 / 5);
        System.out.println("____________________Bài 3________________________");
        System.out.println("Bài 3: Giá trị của d sau khi ép kiểu: " + bai3a(9, 5));
        System.out.println("____________________Bài 4________________________");
        System.out.println("Bai 4: tổng giá trị của các só trong một số ngẫu nhiên là: " + bai4(randomNumber));
        System.out.println("____________________Bài 5________________________");
        System.out.println("bài 5: Chương trình kiểm tra 2 số trả về giá trị là: " + bai5_checkSumer10(2, 0));
        System.out.println("____________________Bài 6________________________");
        System.out.println("Bai 6: Chỉ số BMI ta thu được là " + bai6_indexOfBMI(64.5F, (float) 1.63));
        System.out.println("____________________Bài 7________________________");
        System.out.println("Bai7: in ra thời gian hiện tại của hệ thống: " + LocalDateTime.now());
        System.out.println("Bai7: in ra thời gian hiện tại của hệ thống: " + System.currentTimeMillis());
        System.out.println("_________________Bài 8____________________");
        System.out.println("Hiển thị ra chuỗi của dãy số ");
        Bai8_splitNumberInteger(231432);
        System.out.println("____________________Bài 9________________________");
        System.out.println("Bài 9a: số tăng ngãu nhiên là: " + Bai9a_increNumber(2.0F));
        System.out.println("Bài 9b: số giảm ngãu nhiên là: " + Bai9b_decreNumber(2.0F));
        System.out.println("_____________________Bài 10________________________");
        System.out.println("Bài 10: số ngầu nhiên nhận được là: " + Bai10_ramdomNumberOfRange(40,23));
        System.out.println("_____________________Bài 11a________________________");
        System.out.println("Bài 11: kết quả của đầu vào là: "+
                Bai11a(4332)[0] + " ngày " + Bai11a(4332)[1]+ " năm.");
 System.out.println("_____________________Bài 11b________________________");
        System.out.println("Bài 11b: kết quả của đầu vào là: "+
                Bai11b(525600)[0] + " ngày " + Bai11b(525600)[1]+ " năm.");
 System.out.println("_____________________Bài 11c________________________");
        System.out.println("Bài 11c: kết quả của đầu vào là: "+
                Bai11c(31536000)[0] + " ngày " + Bai11c(31536000)[1]+ " năm.");

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

    public static int bai4(double randomNumber){
        int summer = 0;
        int varTemplate = (int)randomNumber;
        while(varTemplate >=1){
        summer += varTemplate%10;
//            System.out.println(summer);
            varTemplate /= 10;
        }
    return summer;

    }
    public static boolean bai5_checkSumer10(int numOne, int numTwo){
        return numOne == 10 || numTwo == 10 || (numOne + numTwo) == 10;
    }

    public static float bai6_indexOfBMI(float weight, float heigh){
        return (float) (weight/Math.pow(heigh,2));
    }

    public static void Bai8_splitNumberInteger(int a){
        System.out.print(a/100000 + " ");
        System.out.print(a/10000%10+ " ");
        System.out.print(a/1000%100%10+ " ");
        System.out.print(a/100%1000%100%10+ " ");
        System.out.print(a/10%10000%1000%100%10+ " ");
        System.out.print(a%10);
    }

    public static double Bai9a_increNumber(float number){
        return number+ Math.random();
    }
    public static double Bai9b_decreNumber(float number){
        return number- Math.random();
    }

    public static int Bai10_ramdomNumberOfRange(int a, int b){

        return Math.min(a,b)+(int)((Math.max(a,b)-Math.min(a,b))*Math.random());
    }

    public static double[] Bai11a(int hour){
        double[] a= {(double)hour/24, (double)hour/8760};
        return a;
        }
    public static double[] Bai11b(int minute){
        double[] a= {(double)minute/1440, (double)minute/525600};
        return a;
    }
    public static double[] Bai11c(long second){
        double[] a= {(double)second/86400, (double)second/31536000};
        return a;
    }
    }


















