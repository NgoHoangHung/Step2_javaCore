//package Book.oop;
//
//import java.util.Scanner;
//
//public class MainV1 {
//	private static Book Bookobj = null;
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int funtionId = 0;
//		boolean flag = true;
//		do {
//			showmenu();
//			funtionId = sc.nextInt();
//			sc.nextLine();
//			switch (funtionId) {
//			case 1: AddBook();		break;
//			case 2: EditBook();		break;
//			case 3: InfoBook();	 	break;
//			case 4:
//			default: 
//				flag = false; 
//				System.out.println("end");
//				break; 
//			}
//			
//			if(funtionId == 4) {
//				flag = false;
//				
//			}
//		}while(flag == true);
//		sc.close();
//	}
//	public static void showmenu() {
//		myprint("================== BOOK MANAGER =================");
//		myprint("1. Add book");
//		myprint("2. Edit book");
//		myprint("3. Info book");
//		myprint("4. Exit");
//		myprint ("Your choise [1-4]: ");
//		
//	}
//	
//	public static void myprint(String content) {
//		System.out.println(content);
//	}
//	public static void AddBook() {
//		Scanner sc = new Scanner(System.in);
//		String bookName = "";
//		String bookId 	= "";
//		double bookPrice= 0;
//		
//		myprint(" Id = ");
//		bookId = sc.nextLine();
//		
//		myprint(" Name = ");
//		bookName = sc.nextLine ();
//		
//		myprint(" Price = ");
//		bookPrice = sc.nextDouble();
//		
// 		Bookobj = new Book(bookId, bookName, bookPrice);   
//		
//		
//	}
//	public static void EditBook() {
//		if(Bookobj !=null) {
//			Scanner sc = new Scanner(System.in);
//			String bookName = "";
//			double bookPrice= 0;
//			myprint(" Name = ");
//			bookName = sc.nextLine ();
//			
//			myprint(" Price = ");
//			bookPrice = sc.nextDouble();
//			
//			Bookobj.setName(bookName);
//			Bookobj.setPrice(bookPrice);
//		}
//		else {
//			System.out.println("This Book is not exist!");
//		}
//	}
//	
//	
//	public static void InfoBook() {
//		if(Bookobj !=null) {
//			System.out.println(Bookobj);
//		}
//		else {
//			System.out.println("This Book is not exist!");
//		}
//	}
//	
//	public static void Exit() {
//			myprint("Main.Exit()");
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
