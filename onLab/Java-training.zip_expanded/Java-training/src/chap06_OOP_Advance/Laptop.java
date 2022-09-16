package chap06_OOP_Advance;

	abstract public class Laptop {
		void keyboard() {
			System.out.println("Laptop.keyboard()");
		}
	
	abstract public void mainboard(String abs);
	
	protected void display() {
		System.out.println("Laptop.display()");
	}
}
