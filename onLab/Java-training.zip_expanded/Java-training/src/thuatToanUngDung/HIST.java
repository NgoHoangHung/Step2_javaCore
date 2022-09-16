package thuatToanUngDung;
import java.util.Scanner;

public class HIST {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhập vào số lượng test case");
		int TestCase = sc.nextInt();
		Hist(TestCase);
	}
	
	public static void Hist(int amount) {
		
		System.out.printf("%d",amount);
		int[] arr = new int[amount];
		for (int i = 0; i<amount; i++) {
			arr[i] = sc.nextInt();
			System.out.print("arr[i]\t");
		}
	}
}
