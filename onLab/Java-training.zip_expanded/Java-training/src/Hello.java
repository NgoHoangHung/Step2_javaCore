import java.util.Scanner;
import java.lang.Math;
public class Hello {
	public static void main(String[] args) {
		int x, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số x cần tham chiếu");
		x = sc.nextInt();
		
		for(int index = x; index<=x*x*x; index++) {
			//đặt số đếm tạm cho mỗi tham sô index
			int CountTmp = 0;
			for(int i = 1; i<= index; i++) {
				if(index %i == 0) {
					CountTmp++;
				}
			}
			//Kiểm tra tính nguyên tố
			if(CountTmp==2) {
				System.out.printf("%-3d%-5d là số nguyên tố\n",count+1,index);
				count++;
			}
		}
		System.out.println("Tổng các số nguyên tố từ x đến x*x*x là: " + count);	
}
	public static void study1() {
		int a, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số a cần tham chiếu");
		a = sc.nextInt();
		for(int index = a; index<=a*a; index++) {
			if(index%2!= 0 ) {
				System.out.println(index + " là số lẻ!");
				count++;
			}
		}
		System.out.println("Tổng các số lẻ từ a đến a*a là: " + count);
	}
	}
