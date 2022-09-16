package chap06_OOP_Advance;

	public class LaptopAcer extends Laptop{

		void keyboard() {
			System.out.println("LaptopAcer.keyboard()");
		}
		@Override
		 public void mainboard(String xxx) {
			System.out.println(xxx);
		}
	}
