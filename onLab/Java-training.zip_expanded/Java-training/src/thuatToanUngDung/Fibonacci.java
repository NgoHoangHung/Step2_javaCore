package thuatToanUngDung;

public class Fibonacci {
	static int[] iMem = new int[1000];
	public static void main(String[] args) {
		for(int i = 0; i<1000; i++) {
			iMem[i] = -1;
		}
		System.out.println(Fibonaci2(20));
	}
	
	public static int  Fibonaci1(int n) {
		if(n<=2) 
			return 1;
		return Fibonaci1(n- 1) + Fibonaci1(n- 2);
	}
	
	public static int  Fibonaci2(int n) {
		if(n<=2)
			return 1;
		if(iMem[n] != -1) 
			return iMem[n]; 
		int resul = Fibonaci2(n-2) +Fibonaci2(n-1);
			iMem[n] = resul;
		return resul;
	}
}