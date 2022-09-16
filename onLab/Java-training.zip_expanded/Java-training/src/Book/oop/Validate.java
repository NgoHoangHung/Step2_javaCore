package Book.oop;

import java.util.Scanner;

public class Validate{
	private StringBuilder error = new StringBuilder();

	public void printError() {
		System.out.println(error);
	}
/*việc thay đổi giá trị liên tục lên biến "error" sẽ tạo lên sự dư thừa vùng nhớ
 * vì vậy ta cần sử dụng lớp Stringbuilder để  tránh hiện tượng  trên xảy ra.
 * Các thao tác thêm sửa xoá trong lớp Stringbuilder sẽ được sử dụng
 */
	public void setError(String error) {
		this.error.append(error).append("\n");
	}
	
	public boolean checkPrice(Double value) {
		boolean flag = (value>0)&&(value<100);
		if(flag==false) {
			this.setError("Giá trị price nhập vào sai kiểu.");
		}
		return flag;
	}
	public boolean checkName(String value) {
		boolean flag = value.matches("[A-z\\.\\s!]{2,100}");
		if(flag==false) {
			this.setError("Giá trị Name nhập vào sai kiểu.");
		}
		return flag;
	}
	public boolean checkID(String value) {
		boolean flag = value.matches("[A-z]{3}-[0-9]{3}");
		if(flag==false) {
			this.setError("Giá trị ID nhập vào sai kiểu.");
		}
		return flag;
	}
}
