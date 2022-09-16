package Book.oop;

import java.util.Scanner;

public class Book {
	private String id;
	private String name;
	private double price;
	
	public Book(String id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double bookPrice) {
		this.price = bookPrice;
	}
	
	/*
	 * Đây là phương thức ghi đè sẽ hiển thị trực tiếp của các thông số của đối tượng
	 * được xây dựng trong main version 5
	 */
	@Override
	public String toString() {
		  String resul = "Book Info: "
				  		+ "\n- ID     :" + this.id
				  		+	"\n- Name   :" + this.name
				  		+	"\n- Price  :" + this.price;
		return resul;
	}
//	public void showInfo() {
//		System.out.println("Book Info: ");
//		System.out.println("- ID     :" + this.id);
//		System.out.println("- Name   :" + this.name);
//		System.out.println("- Price  :" + this.price);
//	}
	
//	public void EnterBook() {
//		Scanner sc = new Scanner(System.in);
//		String bookName = "";
//		String bookId 	= "";
//		double bookPrice= 0;
//		
//		System.out.println(" Id = ");
//		bookId = sc.nextLine();
//		
//		System.out.println(" Name = ");
//		bookName = sc.nextLine ();			
//		System.out.println(" Price = ");
//		bookPrice = sc.nextDouble();
//		this.Book(bookId,bookName,bookPrice);
//	}

}























