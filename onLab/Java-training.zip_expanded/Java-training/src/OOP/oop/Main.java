package OOP.oop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap cmn so vao");
		System.out.print("\n-------------------------\n x = ");
			int x = sc.nextInt();
		System.out.print("\ny=");
			int y = sc.nextInt();
			
			System.out.print("\nn=");
			int n = sc.nextInt();
			System.out.print("\nm=");
				int m = sc.nextInt();
				
		
		Fraction fractionA = new Fraction(x,y);
		Fraction fractionB = new Fraction(n,m);
		while(true) {
			System.out.println("\nNhap toan hang muon tham chieu: ");
			String Operator = sc.next();
			Fraction fractionC = new Fraction(fractionA,fractionB,Operator);
			System.out.printf("%s + %s = %s",fractionA.print(),fractionB.print(),fractionC.print());
		
		}		
		//		System.out.println(fractionA.print());

		
		
	}

//005	
	
	public static void main005(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap cmn so vao");
		System.out.print("\n-------------------------\n x = ");
			int x = sc.nextInt();
		System.out.print("\ny=");
			int y = sc.nextInt();
			Fraction fractionA = new Fraction(x,y);
			if(fractionA.checkNormalize()==true) {
				System.out.println("Phan so da duoc toi gian");
			}
			else {
				System.out.println("Phan so chua duoc toi gian"); 
			}
			fractionA.normalize();
		System.out.println(fractionA.print());
	}
	
	// 004 Constructor
	public static void main004(String[] args) {
		Student ST1 = new Student("Hung dep trai", "sv0012");
		ST1.showInfo();
	}

	// 003 Overloading
	public static void main003(String[] args) {
		Student ST1 = new Student();

//		Student ST2 = new Student();

		ST1.setName("Hung....");
//		ST1.setCode("K66_CNTT.....");
		ST1.setcode(011);
		ST1.setYear(1990);
		System.out.println();

//		ST2.name = "Thanh";
//		ST2.code = "K65_CNTT";
//		ST2.year = 1996;
//		
		ST1.showInfo();
		int age = ST1.getAge();
		System.out.println(age);

//................

	}
}
