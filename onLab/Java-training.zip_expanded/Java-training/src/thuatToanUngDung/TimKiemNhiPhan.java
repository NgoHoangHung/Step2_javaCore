 package thuatToanUngDung;
import java.util.Scanner;
public class TimKiemNhiPhan {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhập vào dãy:");
		int n;
		int[] A = new int[5];
	for(int i = 0; i<5; i++ ) {
		System.out.print("S[" + i + "] = ");
		A[i] = sc.nextInt();
	}
	System.out.println(Binary_Search(A, 0, 4, 100));
}
	
	static boolean Binary_Search(int[] A,int low,int high,int x) {
		if(low>high)
			return false;
		int mid = (low+high)/2;
		if(A[mid] == x)
			return true;
		if(A[mid] > x) 
			return Binary_Search(A, mid  + 1,high, x);
		else 
			return Binary_Search(A, low, mid -1, x);
}
}