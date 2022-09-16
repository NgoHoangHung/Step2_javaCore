package chap06_OOP_Advance;

public class woman implements Character{
	@Override
	public void run() {
		System.out.println("woman.run()");
	}
	@Override
	public void sleep() {
		System.out.println("woman.sleep()");
	}
}
