package chap05.String;

import java.util.Scanner;

public class A4_StrRE {
	public static void main(String[] args) {
		check_website004();
	}
	
	//001 check number
	//kiem tra so duong tu 1-99 \d{1,2}
	public static void check_001() {
		boolean flagmatch = false;
		String input ="";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Input = ");
			input = sc.nextLine();
			if(input.matches("\\d{1,2}") == true ) {
				System.out.println("Chữ số hợp lệ");
				flagmatch = true;
			}
				
			else 
				System.out.println("Chữ số không hợp lệ");
		}while(flagmatch == false);
		sc.close();
	}

	/*002 checkId
	 * syntax: XXX-YYY
	 * XXX --> (A-Z) or (a-z)
	 * YYY --> (2-8)
	 * [A-z]{3}-[2-8]{3}
	 */
	public static void checkId_002() {
		boolean flagId = false;
		String Id = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Id: ");
			Id = sc.nextLine();
			if(Id.matches("[A-z]{3}-[2-8]{3}") ) {//phương thức String.matches trả về giá trị boolean
				System.out.println("Dữ liệu đầu vào hợp lệ");
				flagId = true;
			}
			else {
				System.out.println("Dữ liệu nhập vào không hợp lệ");
			}
			}while(flagId == false);
		
		sc.close();
	}
	
	/* 003 check username
	 *Tên đăng nhập bắt đầu bằng 1 kí tự hoặc dấu gạch dưới
	 *tên đn là tập hơp của các kí tự a-z, 0-9 và có các kí tự như dấu chấm(.)
	 *Đọ dài của tên [5-32]
	 */
	public static void check_username_003() {
		boolean flag003 = false;
		String UserName = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("User Name = ");
			UserName = sc.nextLine();
			if(UserName.matches("[A-z_][\\w\\.]{4,31}")) {
				System.out.println("User Name hợp lệ");
				flag003 = true;
			}
			else {
				System.out.println("User Name ko hợp lệ");
			}
			
		}while(flag003 = false);
		sc.close();
		
	}
	
	/*004 check website
	 * ^(http?://(www\.)?|(www\.))[a-z0-9\-]{3,}(\.[a-z]{2,4}){1,2}$
	 * http://www.zend.vn
	 * https://www.zend.vn.vn
	 * http://zend.vn
	 * https://zend.vn
	 * www.zend.vn
	 */
	public static void check_website004() {
		boolean flagWebsite = false;
		String Website = "";
		Scanner sc = new Scanner(System.in);
		do {System.out.println("Nhap ten website:");
			Website = sc.nextLine();
			if(Website.matches("^(https?://(www\\.)?|(www\\.))[\\w\\-]{3,}(\\.[a-z]{2,4}){1,2}$")==true) {
		 		System.out.println("Website hợp lệ");
				flagWebsite = true;
			}
			else {
				System.out.println("Website không hợp lệ");
			}
		}while(flagWebsite == false);
	}
}











	














