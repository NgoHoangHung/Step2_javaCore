package thuatToanUngDung;
import java.util.Scanner;
public class LietKeHoanVi {
	static int n;
	static int[] A = new int[100];
	static boolean[] bMark = new boolean[1000];
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		n=3;
		for(int i =0; i<=n;i++) {
			bMark[i] = false;
		}
		Try(1);
	}
	public static void  print(){
		for(int i =1; i<=n;i++) {
			System.out.printf( "%d ",A[i]);
		}
		System.out.println();
	}
	public static void Try(int k) {
		for( int i = 1; i<=n;i++) {
			if(!bMark[i]) { //Kiểm tra !bMark[i] = true,bMark[i] == false
				A[k] = i;
				bMark[i] = true;//khoá lại
			if(k == n) {
				print();
			}
			else{
				Try(k+1);	
			}
				bMark[i] = false;//Mở ra	
			}
		}
	}
}
