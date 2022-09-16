package thuatToanUngDung;

public class BaiToanXepHau {
	static int n;
	static boolean[] bCol = new boolean[1001];
	static boolean[] bDiag1 = new boolean[1001];
	static boolean[] bDiag2 = new boolean[1001];
	static int[] iRes = new int[8];
	public static void main(String[] args) {
		
		 for(int i = 0; i<1001; i++) {
			 bCol[i] = true;
			 bDiag1[i] = true;
			 bDiag2[i] = true;
			}
		 Try(1);
	}
	public static void Try(int i) {
		for( int j =1; j<=n; j++)
			if(bCol[j] && bDiag1[i+j] && bDiag2[Math.abs(i-j)]) {
				iRes[i] = j; // Chấp nhận j 
				// Chấp Nhận trạng thái mới
				bCol[j] = false;
				bDiag1[i+j] = false;
				bDiag2[Math.abs(i-j)] = false;
				if(i==n) {
					for( i = 1; i<=8; i++) {
						System.out.print(iRes[i] + " ");
					}
					System.out.println();
				}
				else 
					Try(i+1);
				//Trả lại trạng thái cũ
				bCol[j] = true;
				bDiag1[i+j] = true;
				bDiag2[Math.abs(i-j)] =true;
			}
	}
}
