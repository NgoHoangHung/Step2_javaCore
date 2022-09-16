package thuatToanUngDung;
import java.util.Scanner;

public class SubSeqMax_DC {
	static int A[] = new int[1000];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nhập giá trị cho các phần tử");
		for(int i = 0; i<=8; i++) {
			System.out.printf("\nA[%d] = ",i );
			A[i] = sc.nextInt();
		}
		System.out.println(SubSeqMax(0,8));;
	}
	static int SubSeqMax(int i, int j) {
		
		if(i==j) return A[i];
			
		int mid = (i+j)/2;
		int wL = SubSeqMax(i,mid);
		int wR = SubSeqMax(mid+1,j);
		int maxLM = MaxLeftMid(i,mid) ;
		int maxRM = MaxRightMid(mid+1,j);
		int wM = maxLM + maxRM;
		return Math.max(Math.max(wL,wR),wM);
	}
	
	static int MaxLeftMid(int i, int j) {
		int maxLM = A[j];
		int s = 0;
		for (int k = j; k >= i; k--) {
			s+= A[k];
			maxLM = Math.max(maxLM,s);
		}
		return maxLM;
	}
	
	static int  MaxRightMid(int i, int j) {
		int maxRM = A[i];
		int s = 0;
		for (int k = i; k <=j ; k++) {
			s+= A[k];
			maxRM = Math.max(maxRM,s);
		}
		return maxRM;
	}
}
