package thuatToanUngDung;

public class LietKeToHop {
	static int[] A = new int[1000];
	static boolean[] bmark = new boolean[1000];
	static int n,m;
	
	public static void main(String[] args) {
		n=5;
		m=3;
		A[0] = 0;
		Try(1);
		
	}
	
	public static void print() {
		for(int i =1; i <=m; i++) {
			System.out.printf("%d ",A[i]);
		}
		System.out.println();
	}
	/*Bản chât của thuật toán tổ hợp nhằm sử dụng lại trạng thái giá trị đằng trước để liên kết với giá trị
	 * sau. ta đặt mốc ban đầu của biến chạy qua biến k và giá trị phần tử đầu
	 * Việc này nhằm tạo cơ sở cứ thay đổi biến k thì vị trí cần tìm cũng thay đổi,  cũng đồng nghĩa
	 * với việc là mốc giá trị giới hạn của biến i cũng sẽ tăng lên 1 đơn vị mỗi khi chương trình thu 
	 * được một tập hợp thoả mãn là 1 tổ hợp của bài cho 
	 */
	public static void Try(int k) {
		for(int i = A[k -1 ] + 1; i <= n - m +k; i++) {
			A[k] = i;
			if(k==m) {
				print();
			}
			
			else {
				Try(k+1);
			}
		}
	}
}
