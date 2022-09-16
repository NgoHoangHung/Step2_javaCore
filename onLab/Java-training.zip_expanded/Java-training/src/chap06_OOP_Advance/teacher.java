package chap06_OOP_Advance;
public class teacher extends Laptop implements People,Bird{
	private String Name;
	private int age;
	
	public teacher(String Name, int age) {
		this.Name = Name;
		this.age = age;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void information() {
		System.out.println("Tên: " + this.getName());
		System.out.println("Tuổi: " + this.getAge());
	}
	public void eat() {
		System.out.println("teacher.eat()");
	}

	@Override
	public void sleep(String hihi) {
		System.out.println(hihi);
	}

	public void fly() {
		System.out.println("teacher.fly()");
	}
	
	public void mainboard(String Abs) {
		System.out.println(Abs);
	}

	@Override
	public void info(teacher aaa) {
		System.out.println("teacher.info()");
	}

	@Override
	public void fly(teacher abc) {
		// TODO Auto-generated method stub
	}
}
