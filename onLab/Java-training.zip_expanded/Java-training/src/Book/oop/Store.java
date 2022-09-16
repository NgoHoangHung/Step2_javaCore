 package Book.oop;

public class Store {
	private static int totalItems		=0;
	private final int MAX_ITEMS		= 50;
	private Book[] listItems	= null;
	
	public Store() {
		 listItems = new Book[MAX_ITEMS]; 
	}
	
	public int getItemPosition(String bookID) {
		for(int i = 0; i< totalItems; i++) {
			if(bookID.equals(this.listItems[i].getId()) == true ) 
				return i;
 		}
		return -1;
	}
	
	//listItems[i] = [bookId BookName BookPrice]
	public boolean checkFull() {
		if(totalItems == MAX_ITEMS) 
			return true;
		
		else 
		
			return false; 
	}
	public boolean checkEmpty() {
		if(totalItems == 0)
			return true;
		else 
		return false;
	}
	
	//Add book
	public void add(Book bookObj) {
		this.listItems[totalItems] = bookObj;
		this.totalItems++;
		System.out.println("Add Successful");
		}
	
	//edit book
	public void edit(String bookID, String bookName, double bookPrice) {
		
//		
			int bookPosition = this.getItemPosition(bookID);
		
		if(bookPosition == -1) {
			System.out.println("This book is not exist");
		}
		else 
		{
			listItems[bookPosition].setName(bookName);
			listItems[bookPosition].setPrice(bookPrice);
			System.out.println("Edit Success");
		}
//		}
//		else {
//			System.out.println("Store is Empty");
//		}
	}
	
	//find book
	public void find(String bookId) {
		int bookPosition = this.getItemPosition(bookId);
		if(bookPosition == -1) {
			System.out.println("This book is not exist");
		}
			
		else {
			System.out.println(listItems[bookPosition]);
		}
			
	}
	
	//delete book
	public void delete(String bookID) {
		int bookPosition = this.getItemPosition(bookID);
		if(bookPosition == -1) {
			System.out.println("This book is not exist");
		}
		else {
			for(int i = bookPosition; i<totalItems -1 ; i++) {
				listItems[i] = listItems[i+1];
				this.listItems[i].setId(this.listItems[i+1].getId());
			}
			totalItems--;
			System.out.println("Delete is Success");
		}
	}
	
	//list book
	public void list() {
		if(this.checkEmpty() == false) {
			for(int i = 0; i<totalItems;i++) {
				System.out.println(this.listItems[i]);
			}
		}
		else
			System.out.println("Store is Empty");
	}
}









