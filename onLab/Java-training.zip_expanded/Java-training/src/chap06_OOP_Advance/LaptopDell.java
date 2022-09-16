package chap06_OOP_Advance;

public class LaptopDell extends Laptop{
	void keyboard() {
		System.out.println("LaptopDell.keyboard()");
	}
	@Override
	public void mainboard(String xxx) {
		// TODO Auto-generated method stub
		System.out.println(xxx);
	}
	
}
