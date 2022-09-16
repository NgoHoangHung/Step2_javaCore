package chap05.String;
import java.util.Scanner;
public class A7_Stringnumber {
	public static void main1(String[] args) {
		study001ChangeNumber();
	}
	
	public static void study001ChangeNumber() {
		// hang chuc hang tram hang don vi
		// 789 --> 7 tram 8 chuc 9 don vi
		boolean flagMatch = true;
		String result = "";
		String num000 = "";
		String num00  = "";
		String num0	  = "";
		Scanner sc = new Scanner(System.in);
		String[] dictionary = {"Không","Một","Hai","Ba","Bốn","Năm","Sáu","Bảy","Tám","Chín"};
		do {
			System.out.println("Nhập vào số có 3 chữ số:");
			String input = sc.nextLine();
			 //hàng trăm
			if(input.matches("\\d{3}") == true){
				int digit000 = Integer.parseInt(input.substring(0,1));
				result += dictionary[digit000] + " Trăm ";
			//hàng chục
					int digit00 = Integer.parseInt(input.substring(1,2));
					result += dictionary[digit00] + " Chục ";	
			//hàng đơn vị
					int digit0 = Integer.parseInt(input.substring(2));
					result += dictionary[digit0] + " Đơn vị ";
					System.out.println(result);
					flagMatch = false;
			}
			else {
				System.out.println("Nhập sai. nhập lại đi");
			}
			
		}while(flagMatch);
	}
}
