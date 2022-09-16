package thuatToanUngDung;
import java.util.Scanner;
public class LietKeNhiPhan {
	static int n;
	static int[] A = new int[1000];
	static int[] iMark = new int [1000];
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		for(int i = 0; i<100; i++) {
			iMark[i]= 0;
		}
		n=3;
		TamPhan(1);
	}
	public static void  print(){
		for(int i =1; i<=n;i++) {
			System.out.printf( "%d ",A[i]);
		}
		System.out.println();
	}
	public static void TamPhan(int k) {
		for(int i = 0; i<=600; i++) {
			if(i == 0) 
				iMark[k] = -1 ; 			
			else if(i ==1) 
				iMark[k] =1; 
			else
				iMark[k] = 0;
		
			if(iMark[k-1] * iMark[k] ==0||iMark[k-1] * iMark[k] == -1 ) {
				A[k]= i;
				if(k==n) {
					print();
				}
				else {
					TamPhan(k+1);
				}
			}
		}
	}
	
	public static void NhiPhan(int k) {
		for( int i =0; i<=1;i++) {
			A[k] = i;
			if(k == n) {
				print();
			}
			else{
				NhiPhan(k+1);	
			}
		}
	}
	
}
