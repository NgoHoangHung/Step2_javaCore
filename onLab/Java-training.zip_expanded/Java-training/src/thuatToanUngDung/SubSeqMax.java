package thuatToanUngDung;

import java.util.Scanner;

public class SubSeqMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào độ dài mảng: ");
		int n = sc.nextInt();
		SSM(n);
		
	}
	
	public static void SSM(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào từng giá trị mảng: ");
		int[] s = new int[n];
		for(int i = 0 ; i< n ; i++) {
			s[i] = sc.nextInt();
		}
		System.out.println(n);
		for(int i = 0; i<n; i++) {
			System.out.printf("%d  ",s[i]);
		}
		System.out.println();
		int maxWeight = 0;
		int Si_Tmp = 0,Sj_Tmp = 0;
		for(int i = 0; i< n-1 ; i++) {
			int WeightTmp = s[i];
			for(int j = i+1 ; j <n; j++) {
					WeightTmp  += s[j];
				if (WeightTmp >maxWeight) {
					maxWeight = WeightTmp;
					Si_Tmp = i;
					Sj_Tmp = j;
				}
			}
			
		}
		System.out.printf("Output: %d tại vị trí s[%d]...s[%d]",maxWeight,Si_Tmp,Sj_Tmp);
	}
}
