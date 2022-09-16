package chap05.String;

import java.util.Scanner;

public class TestChangeNumber {
	
	public static void main(String[] args) {
		ChangeNumber();
	}
	
	public static void ChangeNumber() {
		boolean flagChangeNumber = false;
		Scanner sc = new Scanner(System.in);
		String result = "";
		String num000 = "";
		String num00 = "";
		String num0 = "";
		String[] dictionary = {"không","một","hai","ba", "tư", "năm", "sáu","bảy", "tám","chín"};
		do {
			System.out.println("Nhập số vào đi người anh em: ");
			String input 	= sc.nextLine();
		
			if(input.matches("\\d{3}") == true) {
				flagChangeNumber = true;
				int digit_000 = Integer.parseInt(input.substring(0,1));
				int digit_00 = Integer.parseInt(input.substring(1,2));
				int digit_0 = Integer.parseInt(input.substring(2));
				//hàng trăm
			
				num000 = dictionary[digit_000] +" " +"trăm ";
				
				//hàng chục
			
				num00 = dictionary[digit_00] +" " + "mươi ";
				if(digit_00 == 0) num00 = "linh ";
				if(digit_00 == 1) num00 = "mười ";
				//hàng đơn vị
				
				num0 = dictionary[digit_0] +" đơn vị ";
				if(digit_00 > 1 && digit_0==1) num0 = "mốt đơn vị";
				if(digit_00 > 0 && digit_0==5) num0 = "lăm đơn vị";
				if((digit_00 == 1||digit_00 == 4) && digit_0==4) num0 = "bốn đơn vị";
				if(digit_00 == 4) num00 = "bốn ";
				if(digit_00 == 0&& digit_0==0) {
					num00 ="";
					num0 = "";
				}
				if(digit_0==0) num0 = "đơn vị";
				result = num000 + num00 + num0;
			}
			else
				System.out.println("Nhập lại!");
			System.out.println(result);
		}while(flagChangeNumber == false);
	
	}
	
}






















