package thuatToanUngDung;

public class BaiToanChiaKeo {
	
	static int n= 5,m=12,m0,f,count =0;
	static int[] x = new int[6];
	public static void main(String[] args) {
		Try(1);
	}
	
	public static void Try(int k) {
		if(k==n) {
			count ++;
			x[k] = m - f;
			System.out.println("Trường hợp: " + count);
			for(int i = 1; i<= n; i++) {
				System.out.print(x[i]+ " ");
			}
			System.out.println();
			System.out.println("_________________");
			return;
		}
		m0 = m-f-(n-k);
		for(int v = 1; v<= m0;v++) {
			x[k] = v;
			f = f+ v;
			Try(k+1);
			f= f-v;
		}
		
		/* f: Tổng số kẹo đã chia 
		 * p = n-k : Số lượng em bé cần phải chia
		 * m0 = m-f-p: Số lượng kẹo tối đa có thể chia cho em k
		 * Ứng viên x[k]  và [v thuộc Z, 1<= v <= m0
		 */
		
	}
}
