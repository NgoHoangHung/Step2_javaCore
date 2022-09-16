//package Book.oop;
//
//import java.util.Scanner;
//
//public class MainV4 {
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
//				e.getMessage();
//				myprint("Error! please try again!\n");
//				flag = true;
//				sc.nextLine();
//			}
//		}while(flag == true);
//		sc.close();
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
//			String bookName = "";
//			String bookId 	= "";
//			double bookPrice= 0;
//			
//			myprint(" \nId = ");
//			bookId = sc.nextLine();
//			
//			myprint(" \nName = ");
//			bookName = sc.nextLine ();			
//			myprint(" \nPrice = ");
//			bookPrice = sc.nextDouble();
//			/*chúng ta cần khởi tạo tên lỗi nhằm tránh việc sẽ mất các giá trị lỗi đằng sau
//			 * bởi vì với gói String, việc đảy biến vào getter sẽ gây dư thừa bộ nhớ
//			 * đồng thời làm mất các giá trị của các tiến trình đằng sau. 
//			 * ví dụ như khi check lỗi ID, name, price. nếu cả 3 cùng lỗi thì chương trình 
//			 * chỉ in ra lỗi của ID mà ko cho ta biết lỗi của name và price đều đang có 
//			 * Nên ở đây, ta sẽ không dùng câu lệnh 
//			 * if(validateObj.checkID(bookId)&&validateObj.checkname(bookName)....
//			 * mà ta sẽ khởi tạo ra hai biến boolean cho hai giá trị trên
//			 */
//			
//			Validate validateObj = new Validate();
//			boolean flagID = validateObj.checkID(bookId);
//			boolean flagName = validateObj.checkName(bookName);
//			boolean flagPrice = validateObj.checkPrice(bookPrice);
//			
//			if(flagID&&flagName&&flagPrice==true) {
//				Book bookObj = new Book(bookId,bookName,bookPrice);
//				storeObj.add(bookObj);
//			}
//			else {
//				validateObj.printError();
//			}
//	}
//		
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
//}
