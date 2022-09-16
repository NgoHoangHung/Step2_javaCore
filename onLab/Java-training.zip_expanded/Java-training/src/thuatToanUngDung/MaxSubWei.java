package thuatToanUngDung;
import java.lang.Math;
public class MaxSubWei {
	static int[] A = new int[1000];
	static int[] iMem = new int[1000];
	static boolean[] bMark = new boolean[1000];
	
	public static void main(String[] args) {
		MaxSum(10);
	}
	public static int MaxSum(int i) {
		if( i ==1) {
			return A[i];
		}
		if(bMark[i])
			return iMem[i];
		int res = Math.max(A[i], A[i]+ MaxSum(i-1));
		iMem[i] = res;
		bMark [i] = true;
		return res;
		
	}
	
}
