package chap05.String;

import java.util.Scanner;

public class A5_StrSplit {
	public static void main(String[] args) {
		Take_Token005_with_split();
	}
	/*006 Tokenizer
	 * 
	 */
		 	

	/*005 Phương thức tách split() trong java String
	 * Tách một chuỗi theo biểu thức chính quy(regular expressrion)
	 * cú pháp: public String split(String regex)
	 * public String split(String regex, int limit)
	 */
	public static void Take_Token005_with_split() {
		String str = "erq 7465-qerqw3456 dsgf 356jghj34564 rtwer";
		String[] arrStr = str.split("\\s+\\d+\\s+");
		System.out.println(arrStr.length);
		for(String elm:arrStr) {
			System.out.println(elm);
		}
	}
	
	public static void Take_Token004_with_useDelimiter3() {
		String str = "qwer-3432 weqrwe-2345    qwerqwe-34223453245 wqerwqe- wqerwq"; 
		Scanner sc = new Scanner(str);
		sc.useDelimiter("\\-+\\d+\\s+");
		while(sc.hasNext()) {
		String token = sc.next();
		System.out.print(token);
		
	}System.out.println(str);
	}
	public static void study003xx() {
		
	}
	public static void Take_Token003_with_useDelimiter2() {
		String str = "qwer-weqrwe- qwerqwe -wqerwqe- wqerwq"; 
		Scanner sc = new Scanner(str);
		sc.useDelimiter("[- ]");
		while(sc.hasNext()) {
		String token = sc.next();
		System.out.println(token);
	}
	}
	public static void study002xx() {
		String str = "toi-+dang-+di-+hoc";
		Scanner sc = new Scanner (str);
		sc.useDelimiter("[-+]");
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}
		sc.close();
		
	}
	public static void Take_Token002_with_useDelimiter1() {
		String str = "qwer-weqrwe-qwerqwe-wqerwqe-wqerwq"; 
		Scanner sc = new Scanner(str);
		sc.useDelimiter("-");
		while(sc.hasNext()) {
		String token = sc.next();
		System.out.println(token);
		}
	}
	
		public static void Take_token001() {
		
			String str = "rew wertg wr wrwr erww";
		Scanner sc2 = new Scanner(str);
		while(sc2.hasNext()) {
			String token = sc2.next();
			System.out.println(token);
		}
		sc2.close();
	}
		public static void Study001xx()
		{
			String str = "toi dang di hoc";
			Scanner sc = new Scanner (str);
			while(sc.hasNext())
			{
				System.out.println(sc.next()+ " " + sc.hasNext());
			}
			sc.close();
		}

}
