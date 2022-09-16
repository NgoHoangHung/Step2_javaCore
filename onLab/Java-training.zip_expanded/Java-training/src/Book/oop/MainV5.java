package Book.oop;

import java.util.Scanner;

/*Sau khi chúng ta học xong hướng đối tượng nâng cao thì ta sẽ tiếp tục 
 * xây dựng book store và ta sẽ đến với version5 
 * ở main version 4, ta đã ôn lại những nội dung đã thực hiện. 
 * Sau khi ta thực hiện các đoạn lệnh xử lý chuối cũng như cách sử dụng regelar expression
 * để kiểm tra sự hợp lệ của dữ liệu thì ta tiến hành nâng cấp ứng dụng book store trong các 
 * vấn đề về việc kiểm tra Id HỢP lệ
 * 
 * còn trong version 5 thì chúng ta sẽ thực hiện các yêu cầu sau
 *   	- ta sử dụng phương thức toString của đối tượng Object trong việc hiển thị thông tin
 *   của đối tượng 
 *   	- tiếp tục ta sử dụng đến interface để xây dựng StoreInterface quy định các 
 *   phương thức bắt buộc phải có 
 *  để quản lí các sản phẩm trong cửa hàng : add(),edit(); delete(); checkEmpty(), checkFull()
 *   	
 *   chức năng đầu tiên là chức năng toString của đối tượng Object
 *   Khi ta thêm mới một quyển sách thì ta tiến hành sử dụng phương thức add() 
 *   Book Info: 
	- ID     :adb-123
	- Name   :hung dep trai
	- Price  :12.3
	sau khi thêm được rồi, sử dụng phương thức ListBook để hiển thị các thông
	tin như trên, trong phương thức ấy, ta sử dụng phương thức showinfo
		public void showInfo() {
		System.out.println("Book Info: ");
		System.out.println("- ID     :" + this.id);
		System.out.println("- Name   :" + this.name);
		System.out.println("- Price  :" + this.price);
	}		
	
	*********************************************************************
	*Trong bài này, ta sẽ không sử dụng phương thức ShowInfo nữa mà sẽ sử dụng 
	* toString. Ta sẽ sử dụng kĩ thuật ghi đè lên phương thức
	* ToString Override để thiết kế 
	* @Override
	public String toString() {
		  String resul = "Book Info: "
				  		+ "\n- ID     :" + this.id
				  		+	"\n- Name   :" + this.name
				  		+	"\n- Price  :" + this.price;
		return resul;
	}
 */
public class MainV5 {
	private static BookStore storeObj = new BookStore();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int funtionId = 0;
		boolean flag = true;
		do {
			showmenu();
			try {
				funtionId = sc.nextInt();
				sc.nextLine();
				switch (funtionId) {
				case 1: AddBook();		break;
				case 2: EditBook();		break;
				case 3: DeleteBook();	break;
				case 4: FindBook();	 	break;
				case 5: ListBook();	 	break;
				case 6:
				default: 
					flag = false; 
					System.out.println("\nend");
					break; 	
			}
			
			}
			catch(Exception e) {
				myprint("Error! please try again!\n");
				flag = true;
				sc.nextLine();
			}
		}while(flag == true);
		sc.close();
	}
	public static void showmenu() {
		myprint("================== BOOK MANAGER =================");
		myprint("\n1. Add book");
		myprint("\n2. Edit book");
		myprint("\n3. Delete book");
		myprint("\n4. Find book");
		myprint("\n5. List book");
		myprint("\n6. Exit");
		myprint ("\nYour choise [1-6]: ");
		
	}
	
	public static void myprint(String content) {
		System.out.print(content);
	}
	public static void AddBook() {
		if(storeObj.checkFull() == false) {
			Scanner sc = new Scanner(System.in);
			String bookName = "";
			String bookId 	= "";
			double bookPrice= 0;
			
			myprint(" \nId = ");
			bookId = sc.nextLine();
			
			myprint(" \nName = ");
			bookName = sc.nextLine ();			
			myprint(" \nPrice = ");
			bookPrice = sc.nextDouble();
			/*chúng ta cần khởi tạo tên lỗi nhằm tránh việc sẽ mất các giá trị lỗi đằng sau
			 * bởi vì với gói String, việc đảy biến vào getter sẽ gây dư thừa bộ nhớ
			 * đồng thời làm mất các giá trị của các tiến trình đằng sau. 
			 * ví dụ như khi check lỗi ID, name, price. nếu cả 3 cùng lỗi thì chương trình 
			 * chỉ in ra lỗi của ID mà ko cho ta biết lỗi của name và price đều đang có 
			 * Nên ở đây, ta sẽ không dùng câu lệnh 
			 * if(validateObj.checkID(bookId)&&validateObj.checkname(bookName)....
			 * mà ta sẽ khởi tạo ra hai biến boolean cho hai giá trị trên
			 */
			
			Validate validateObj = new Validate();
			boolean flagID = validateObj.checkID(bookId);
			boolean flagName = validateObj.checkName(bookName);
			boolean flagPrice = validateObj.checkPrice(bookPrice);
			
			if(flagID&&flagName&&flagPrice==true) {
				Book bookObj = new Book(bookId,bookName,bookPrice);
				storeObj.add(bookObj);
			}
			else {
				validateObj.printError();
			}
	}
		
		else 
			myprint("\nStore is Full");
		}
	
	public static void EditBook() {
		if(storeObj.checkEmpty() == false) {
		Scanner sc = new Scanner(System.in);
		String bookName = "";
		String bookId   = "";
		double bookPrice= 0;
		myprint("\nID   :");
		bookId = sc.nextLine();
		myprint("\nName :");
		bookName = sc.nextLine();
		myprint("\nPrice :");
		bookPrice = sc.nextDouble();
		storeObj.edit(bookId, bookName, bookPrice);
		}
		else {
			myprint("\nStore is Empty");
			myprint("\nTien hanh nhap yeu cau khac");
		}
	}

	public static void DeleteBook() {
		if(storeObj.checkEmpty() == false) { 
		Scanner sc = new Scanner(System.in);
		 myprint("\nNhap vao Id quyen sach can xoa: ");
		 String bookId = sc.nextLine();
		 storeObj.delete(bookId);
		}
		else {
			myprint("\nStore is Empty");
		}
}
	
public static void FindBook() {
	//Nhap vao gia tri ID muon tim kiem 
	//roi luu vao bien  bookid
		myprint("\nNhap vao gia tri can tim kiem:");
		Scanner sc = new Scanner(System.in);
		String BookID = sc.nextLine();
		storeObj.find(BookID);
}

public static void ListBook() {
		storeObj.list(); 
	}

public static void Exit() {
	myprint("\nMain.Exit()");
}
}


