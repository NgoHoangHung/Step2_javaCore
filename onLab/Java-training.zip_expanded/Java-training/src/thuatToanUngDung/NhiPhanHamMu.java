package thuatToanUngDung;

public class NhiPhanHamMu {
	static int count =0;
	public static void main(String[] args) {
		
		System.out.println(Pow(3,11));
		System.out.println("Số làn tính toán " + count);
	}
	
	static double Pow(int x, int n) {
		if(n==0)
			{
			count++;
			return 1;
			}
		 if(n%2!=0) {count++;
			return x*Pow(x,n-1);}
		 
		double resul = Pow(x,n/2);
		count++;
		return resul*resul;
	}
}
 