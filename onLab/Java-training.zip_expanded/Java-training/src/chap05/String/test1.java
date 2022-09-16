//package chap05.String;
//import java.util.Scanner;
//public class test1 {	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		//Không có khoảng trắng ở đầu và cuối chuỗi
//		System.out.println("Nhập vào một chuỗi: ");
//		String str =  sc.nextLine();
//		System.out.println("Sau đây là bước làm đẹp!");
//		System.out.println("cắt gọt đầu đuôi!");
//		str =str.trim();
//		System.out.println("("+str.length()+")"+ str);
//		//Các từ cách nhau bằng dấu cách
//		System.out.println("tiếp theo là bước thu gọn ");
//		str = str.replaceAll("\\s+\\d+\\s+"," ");
//		System.out.println("("+str.length()+")"+ str);
//		//Các chữ cái đầu phải viết bằng in hoa
//		String[] strarr = str.split(" ");
//		String strcomplete = "";
//		for( String strtmp: strarr) {
//			strtmp = strtmp.substring(0,1).toUpperCase() + strtmp.substring(1).toLowerCase();
//			strcomplete += strtmp + " ";
//		}
//		System.out.println("("+strcomplete.length()+")"+ strcomplete);
//		//Hết câu thì kết thúc câu bằng dấu chấm 
//		//các kí tự đầu tiên ở mỗi từ phải được viết hoa
//	
//	}
//}
