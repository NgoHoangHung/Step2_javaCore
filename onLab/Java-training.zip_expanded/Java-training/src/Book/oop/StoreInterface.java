package Book.oop;

public interface StoreInterface {
	/*
	 *Dưới đây là các abstract method sẽ được các class con kế thừa.
	 *Ta sẽ khai báo các phương thức tối thiểu cần có để có thể tận dụng
	 *không chỉ đối với riêng kho sách mà còn có thể là các kho điện tử vv.vv
	 */
	public boolean checkFull();
	public boolean checkEmpty();
	public void add(Object Obj);
	public void edit(String ID, String Name, double Price) ;
	public void find(String ID);
	public void delete(String ID) ;
	public void list();
	
}
