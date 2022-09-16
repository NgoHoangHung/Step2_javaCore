//package Book.oop;
//
//import java.util.Scanner;
//
//public class MainV4_test {
//	private static Store storeObj = new Store();
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int funtionId = 0;
//		boolean flag = true;
//		do {
//			showmenu();
//			try {
//				funtionId = sc.nextInt();
//				sc.nextLine();
//				switch (funtionId) {
//				case 1: AddBook();		break;
//				case 2: EditBook();		break;
//				case 3: DeleteBook();	break;
//				case 4: FindBook();	 	break;
//				case 5: ListBook();	 	break;
//				case 6:
//				default: 
//					flag = false; 
//					System.out.println("\nend");
//					break; 	
//			}
//			
//			}
//			catch(Exception e) {
//				myprint("Error! please try again!\n");
//				flag = true;
//				sc.nextLine();
//			}
//		}while(flag == true);
////		sc.close();
//	}
//	public static void showmenu() {
//		myprint("================== BOOK MANAGER =================");
//		myprint("\n1. Add book");
//		myprint("\n2. Edit book");
//		myprint("\n3. Delete book");
//		myprint("\n4. Find book");
//		myprint("\n5. List book");
//		myprint("\n6. Exit");
//		myprint ("\nYour choise [1-6]: ");
//		
//	}
//	
//	public static void myprint(String content) {
//		System.out.print(content);
//	}
//	public static void AddBook() {
//		if(storeObj.checkFull() == false) {
//			Scanner sc = new Scanner(System.in);
//			boolean flagID = false;
//			boolean flagName = false;
//			
//			boolean flagPrice = false;
//			
//			String bookName = "";
//			String bookId 	= "";
//			double bookPrice= 0;
//			
//			
//			
//			do {
//				myprint(" \nId = ");
//				bookId = sc.nextLine();
//				if(bookId.matches("[A-z]{3}\\-\\d{3}") == true) {
//					flagID = true;
//				}
//				else
//					System.out.println("ID sai cú pháp rồi. Nhập lại đi!");
//			}while(flagID == false);
//			
//			
//			do {
//				myprint(" \nName = ");
//				bookName = sc.nextLine ();
//				if(bookName.matches("[\\w\\d\\.\\!\\s]{5,100}"))
//					flagName = true;
//				else
//					System.out.println("Name sai cú pháp rồi. Nhập lại đi!");
//			}while(flagName==false);
//			
//			do {
//				myprint(" \nPrice = ");
//				bookPrice = sc.nextDouble();
//				if(bookPrice>= 0 && bookPrice<=100) {
//					flagPrice = true;
//				}
//				else
//					System.out.println("Giá trị quyển sách sai kiểu. Nhập lại đi");
//			}while(flagPrice == false);
//	
//			Book bookObj = new Book(bookId,bookName,bookPrice);
//			
//			storeObj.add(bookObj);
//	}
//		else 
//			myprint("\nStore is Full");
//		}
//	
//	public static void EditBook() {
//		if(storeObj.checkEmpty() == false) {
//		Scanner sc = new Scanner(System.in);
//		String bookName = "";
//		String bookId   = "";
//		double bookPrice= 0;
//		myprint("\nID   :");
//		bookId = sc.nextLine();
//		myprint("\nName :");
//		bookName = sc.nextLine();
//		myprint("\nPrice :");
//		bookPrice = sc.nextDouble();
//		storeObj.edit(bookId, bookName, bookPrice);
//		}
//		else {
//			myprint("\nStore is Empty");
//			myprint("\nTien hanh nhap yeu cau khac");
//		}
//	}
//
//	public static void DeleteBook() {
//		if(storeObj.checkEmpty() == false) { 
//		Scanner sc = new Scanner(System.in);
//		 myprint("\nNhap vao Id quyen sach can xoa: ");
//		 String bookId = sc.nextLine();
//		 storeObj.delete(bookId);
//		}
//		else {
//			myprint("\nStore is Empty");
//		}
//}
//	
//public static void FindBook() {
//	//Nhap vao gia tri ID muon tim kiem 
//	//roi luu vao bien  bookid
//		myprint("\nNhap vao gia tri can tim kiem:");
//		Scanner sc = new Scanner(System.in);
//		String BookID = sc.nextLine();
//		storeObj.find(BookID);
//}
//
//public static void ListBook() {
//		storeObj.list(); 
//	}
//
//public static void Exit() {
//	myprint("\nMain.Exit()");
//}
//
//}
