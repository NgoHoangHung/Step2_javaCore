package chap06_OOP_Advance;

public class main {
	public static void main(String[] args) {
	
	study05();	
	}
	public static void study05() {
		People studentObj = new student();
		teacher teacherObj = new teacher("Thảo", 30);
		 
		studentObj.info(teacherObj);
	}
	
	public static void study04() {
		PlayStation playStationObj = new PlayStation();
		man A_Man = new man();
		woman A_Woman = new woman();
		playStationObj.play(A_Man);
	}

	public static void study03() {
		Course courseJava = new Course("JAVA", 50);
		Course coursePHP  = new Course("PHP", 50);

		System.out.println(courseJava);
		System.out.println(coursePHP);
		if(courseJava.equals(coursePHP)) 
			System.out.println("Bằng nhau");
		else 
			System.out.println("Không bằng nhau");
		
		
	}
	
	public static void study02() {
		teacher peopleObj = new teacher("Trang",19);
		peopleObj.eat("Abc xyz");
		peopleObj.sleep("Hùng đẹp trai");
		peopleObj.fly();
		peopleObj.information(); 
		peopleObj.mainboard("Ngô Hoàng Hùng");
		peopleObj.display();
	}
	
	//Abstract class
	public static void study01() {
		Laptop LaptopObj = new LaptopAcer();
		LaptopObj.keyboard();
		LaptopObj.mainboard("Hùng đẹp trai");
		LaptopObj.display();
		
		LaptopObj = new LaptopDell();
		LaptopObj.keyboard();
		LaptopObj.mainboard("Hùng đẹp trai voãi   ");
		LaptopObj.display();
		
	}
}
