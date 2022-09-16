package thuatToanUngDung;

public class TImNghiemPhuongTrinhX3 {
	static int count;
	public static void main(String[] args) {
	
		System.out.println(Binary_Search(-100.0, 100.0));
		System.out.println(count);
	}
	static double hamF(double x) {
		return x*x*x - 100*x*x + 20*x +30;
	}
	static boolean checkNghiem(double x) {
		double f = x*x*x - 100*x*x + 20*x +30;
		if(Math.abs(f) <0.00000000001)
			return true;
		return false;
	}
	static double Binary_Search(double low, double high) {
		if(low>high)
			return -1;
		double mid = (low+high)/2;
		if(checkNghiem(mid)) {
			count++;
			return mid;
		}
			
		if(hamF(low) * hamF(mid)< 0) {
			count++;
//			System.out.print("0");
			high = mid;
			return Binary_Search(low, mid);
		}
		else {
			count++;
//			System.out.print("1");
			low = mid;
			return Binary_Search(mid, high);
		}
		
		
//		return mid;
//		if(hamF(low) * hamF(high)> 0) {
//			if(hamF(low) * hamF(mid)< 0) {
//				Binary_Search(low, mid);
//			}
//			else if(hamF(mid) * hamF(high)< 0) {
//				Binary_Search(mid, high);
//			}
//			else 
//				return -1;
//		}
		
			
			
//			
//			else if(hamF(low) * hamF(high)> 0) 
//			return Binary_Search(A, mid  + 1,high, x);
//		else 
//			return Binary_Search(A, low, mid -1, x);
//}
		}
	}
