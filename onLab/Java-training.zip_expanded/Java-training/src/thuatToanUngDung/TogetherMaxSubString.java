package thuatToanUngDung;

public class TogetherMaxSubString {
	static String s1 = "abcd";
	static String s2 = "bdcab";
	static char[] X = s1.toCharArray();
	static char[] Y = s2.toCharArray();
	
	static String SubString = "";
	static int[][]iMem = new int[1001][1001];
	public static void main(String[] args) {
		for (int i = 0; i <= 1001; i++) {
			for (int j = 0; j <= 1001; j++) {
				iMem[i][j]= -1;
			}
		}
		LCS(0,0);
		Trace(0,0);
	}
	
	public static int LCS(int i, int j) {
		if(i== 0 || j== 0) 
		return 0;
		
		if(iMem[i][j] != -1) 
			return iMem[i][j];
		
		int res = 0; 
		res = Math.max(res, LCS(i,j-1));
		res = Math.max(res, LCS(i-1,j));
		if(X[i] == Y[j]) {
			res = Math.max(res, 1 + LCS(i-1,j-1));
		}
		iMem[i][j] = res; 
		return res;
	}
	
	public static void Trace(int i, int j) {
		if(i==0||j==0) return;
	
		if(iMem[i][j] == iMem[i-1][j]) {
			Trace(i-1,j);
			return;
		}
		
		if(iMem[i][j] == iMem[i][j-1]) {
			Trace(i,j-1);
			return;
		}
		
		if(X[i] == Y[j] && iMem[i][j] ==1 +iMem[i-1][j-1]) {
			Trace(i-1,j-1);
			System.out.println(X[i] + " ");
		}
	}
}
