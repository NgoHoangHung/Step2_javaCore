package thuatToanUngDung;

public class BaiTap {
	
	public static void main(String []args){
	        
	        int [] arr = {-16, 7, -3, 0, -1, 5, -4};
	        boolean [] bMark = new boolean [7];
	        int [] iMem = new int [7];
	        
	        maxSum(6, arr, bMark, iMem);
	        trace(5,iMem, arr);
	     }
	    public static int maxSum(int i, int [] arr, boolean [] bMark, int [] iMem){
	        if(bMark[i]){
	             return iMem[i];
	         }
	         if(i == 0){
	             iMem[i] = arr[i]*arr[i]*arr[i];
	             bMark[i] = true;
	             return arr[i]*arr[i]*arr[i];
	         }
	        
	         int a = arr[i]*arr[i]*arr[i];
	         int res = Math.max(a, a + maxSum(i-1, arr, bMark, iMem));
	         iMem[i] = res;
	         bMark[i] = true;
	         return res;
	     }
	     public static void trace(int i, int [] iMem, int [] arr){
	         if(i != 0 && iMem[i] == arr[i]*arr[i]*arr[i] + iMem[i-1] ){
	             trace(i-1, iMem, arr);
	         }
	         System.out.print(arr[i]+" ");
	     }
	}

