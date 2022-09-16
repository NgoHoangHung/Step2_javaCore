package chap05.String;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		checkWebsite();
	}
	
	public static void checknumber() {
		boolean flagid = false;
		Scanner sc = new Scanner(System.in);
		String id = "";
		do {
			System.out.print("ID = ");
			id = sc.nextLine();
			if(id.matches("\\d{1,2}") == true) {
				System.out.println("số nhập vào hợp lệ");
				flagid = true;
			}
			else 
				System.out.println("Số nhập vào không hợp lệ");
			
		}while(flagid == false);
		System.out.println("end");
		sc.close();
	}
	/*002 checkId
	 * syntax: XXX-YYY
	 * XXX --> (A-Z) or (a-z)
	 * YYY --> (2-8)
	 * [A-z]{3}-[2-8]{3}
	 */
	public static void checkID() {
		boolean flagID =false;
		String ID = "";
		Scanner sc = new Scanner(System.in);
		
		do {
			 System.out.println("ID = ");
			 ID = sc.nextLine();
			 if(ID.matches("^[A-z]{3}-[2-8]{3}$") == true) {
				 flagID = true;
				 System.out.println("Số nhập vào hợp lệ");
			 }
			 else 
				 System.out.println("Số nhập vào không hợp lệ");
		}while(flagID == false);
	System.out.println("End");
	sc.close();
	}
	/* 003 check username
	 *Tên đăng nhập bắt đầu bằng 1 kí tự hoặc dấu gạch dưới
	 *tên đn là tập hơp của các kí tự a-z, 0-9 và có các kí tự như dấu chấm(.)
	 *Đọ dài của tên [5-32]
	 */
	public static void CheckUsername() {
		boolean flagUsername = false;
		String UserName = "";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Nhập User Name:");
			UserName = sc.nextLine();
			if(UserName.matches("^[A-z_][\\w\\.]{4,31}$")==true) {
				System.out.println("Nhập tên đúng kiểu rồi!");
				flagUsername = true;
			}
			else
				System.out.println("Nhập tên sai kiểu rồi");
			sc.close();
		}while(flagUsername == false);
		System.out.println("End");
	}
	/*004 check website
	 * ^(http?://(www\.)?|(www\.))[a-z0-9\-]{3,}(\.[a-z]{2,4}){1,2}$
	 * http://www.zend.vn
	 * https://www.zend.vn.vn
	 * http://zend.vn
	 * https://zend.vn
	 * www.zend.vn
	 */
	public static void checkWebsite() {
		boolean flagWebsite = false;
		String Website = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập tên website:");
			System.out.println("Website:");
			Website = sc.nextLine();
			if(Website.matches("^(https?://(www\\.)?|(www\\.))[\\w\\-]{3,}(\\.[a-z]{2,4}){1,2}$")== true) {
				System.out.println("Đã nhập đúng kiểu!");
				flagWebsite = true;
			}
			else
				System.out.println("Dữ liệu đầu vào sai kiểu!");
		}while (flagWebsite== false);
		sc.close();
	}
}  














