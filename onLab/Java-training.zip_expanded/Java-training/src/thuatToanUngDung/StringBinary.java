package thuatToanUngDung;
import java.util.Scanner;
public class StringBinary {
	static Scanner sc = new Scanner(System.in);
	static int[] A = new int[100];
	static int n;
	public static void main(String[] args) {
		n =5;
		String_Binary(1);
	}
	
	public static void String_Binary(int k) {
		for (int i =0; i<=1; i++) {
			A[k]=i;
			if(k == n) {
				for(int j= 1; j<=n;j++) {
					System.out.print(A[j]+ " ");
				}
				System.out.println("");
				System.out.println("----------------------");
			}
			else String_Binary(k+1);
			
		}
	}
/* Try(k = 1)
 * 		for(int i = 0; i < = 1 ; i++){
 *			...
 *			 Try(k =2)
 * 				for(int i = 0; i < = 1 ; i++){
 *			...
 *				 Try(k = 3)
 * 					for(int i = 0; i < = 1 ; i++){
 *			...		
 *			 	 		Try(k = 4)
 * 							for(int i = 0; i < = 1 ; i++){
 *			...
 *		}						 Try(k = 5)
 * 									for(int i = 0; i < = 1 ; i++){
 *		
 *		}
 *		}
 *		}
 *	
 *		} 
 * 
 */
}

