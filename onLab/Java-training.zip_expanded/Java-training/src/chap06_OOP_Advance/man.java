package chap06_OOP_Advance;

public class man implements Character{
	@Override
	public void run() {
		System.out.println("man.run()");
	}
	@Override
	public void sleep() {
		System.out.println("man.sleep()");
	}
}
