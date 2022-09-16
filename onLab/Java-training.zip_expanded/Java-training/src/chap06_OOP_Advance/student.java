package chap06_OOP_Advance;

public class student implements Bird,People {

	@Override
	public void fly(teacher abc) {
		System.out.println(abc.getName());
		System.out.println(abc.getAge());
	}

	@Override
	public void info(teacher aaa) {
		System.out.println("tên: " + aaa.getName());
		System.out.println("tuổi: " + aaa.getAge());
	}

}
