package thuatToanUngDung;
import java.util.Scanner;

	
public class DienTichHinhChuNhat {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	System.out.println("Nhập vào độ dài mảng: ");
	int n = sc.nextInt();
	SSM(n);
	
}

public static void SSM(int n) {
	int tmp = 2; 
	System.out.println("Nhập các giá trị thành phần đa giác: " );
	int[] output = new int[n];
	do {
		int[] A = new int[tmp];
		 
		for(int i =0 ;i<tmp; i++) {
			A[i] = sc.nextInt();
		}
//		int maxArea = A[0];
		
		int Area_Tmp1 = A[0];
		int Area_Tmp2 = A[0];
		int Si_tmp=0;
		int Sj_tmp=0;
		for(int i = 0; i<tmp-1; i++) {
			for(int j = i +1; j<tmp; j++) {
				
				for(int k = i; k<= j; k++) {
					if(A[i] > A[k]) {
 						Area_Tmp1 = A[k] * (k-i+1);
 						Si_tmp = i;
 						Sj_tmp = k;
				}
					if(A[i]<A[k]) {
						Area_Tmp2 = A[i] * (k-i+1);
 						Si_tmp = i;
 						Sj_tmp = k;
					}
					if()
				
			}
				
		}
			output[tmp] = Area_Tmp;
		tmp++;
	}while(tmp<n);
	
	for(int i = 0; i< tmp; i++) {
		System.out.print();
	}
	for(int i = 0 ; i< n ; i++) {
		
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
