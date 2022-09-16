package thuatToanUngDung;

import java.util.Scanner;

public class SMS {
	static Scanner sc = new Scanner(System.in);
	static String[] Keyboard = {"1","abc2","def3","ghi4","jkl5","mno6","pqrs7","tuv8","wxyz9"," 0"};
	public static void main(String[] args) {
		System.out.println("Nhập vào số lượng test case: ");
		int T = sc.nextInt();
		sc.nextLine();
		for(int i =0; i<T; i++) {
			System.out.println(i+1+ ", Nhập vào chuỗi cần test");
			String input = sc.nextLine();
			System.out.println("count = "+ countSMS(input));
			sc.nextLine();
	}
	
	}	
	public static int countSMS(String input) {
		int count =0;
		char[] ch = input.toCharArray();// chuyển đổi biến String sang 1 chuỗi kiểu char 
		for(int i = 0; i<input.length(); i++) {
			for(int j =0; j<10 ; j++) {
				for(int k =0; k<Keyboard[j].length(); k++) {
					if(ch[i]==Keyboard[j].charAt(k)) {
						count+=k+1;
					}
				}
			}
		}
		return count;
	}
}

