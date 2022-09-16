package chap06_OOP_Advance;

public interface People {
	abstract public void info(teacher teacherObj);
	public default void sleep(String text) {
		System.out.println(text);
	}
	public default void test(String text) {
		System.out.println(text);
	}
}
