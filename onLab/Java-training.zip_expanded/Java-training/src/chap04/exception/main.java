package chap04.exception;

public class main {

	public static void main(String[] args) {
//		study002();
		try {
			myFunction(6,3);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Thực hiện được lệnh toán học ArithmeticException");
			e.printStackTrace();
		}
//		try {
//			Thread.sleep(500);
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//			System.out.println("111");
//		}
//		try {
//			myFunction(6,2);
//		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Thực hiện được lệnh ngoại lệ Exception");
			e.printStackTrace();
		}
		System.out.println("finish");
//		catch(Exception x) {
//			
//		}
//		System.out.println("hey guy");
	}
	//Throws throw 
	public static void myFunction(int n1,int n2) throws ArithmeticException,Exception{
		if(n2==0) throw new ArithmeticException("Loi chia cho 0");
		if(n2%2==0) throw new ArithmeticException("Loi chia cho so chan");
		System.out.println(n1/n2);
		
	}
	/*
	 * Finally di vs cau truc try-catch thi cho du co exception hay khong va 
	 * cac exception ko duoc viet trong catch thi cac cau lenh trong exception van duoc thuc thi
	 */
	public static void study005() {
		int number1 =5;
		int number2 =0;
		System.out.println("Nhan the ATM");
		try {
			System.out.println(number1/number2);
		}
		finally {
			System.out.println("Tra the ATM");
		}
		}
		
	
	// exception: Runtime + Checked
	public static void study004() {
		int number1 =5;
		int number2 =0;
		System.out.println(number1/number2);// loi runtime. xuat phat tu luc bien dich
		/*vi du 1:
		 * thread.sleep(500);//loi khong ton tai nen se duoc check\
		 *vi du 2:
		 * FileOutputStream fileObj = new FileOutputStream("abc.txt");
		 */
	}
	
	// vi du cau truc try--catch
 	public static void study003() {
		int number1 = 5;
		int number2 = 0;
		System.out.println("Nhan the ATM");
		try {
			System.out.println(number1 / number2);
		}catch(ArithmeticException e){
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		} 
		System.out.println("Tra the ATM");
	}
	//vi du truy cap phan tu khong ton tai trong mang
	public static void study002() {
		 int[] arrInt = {1, 2, 3};
		 System.out.println("Nhan the  ATM");
		 System.out.println(arrInt[0]);
		 System.out.println(arrInt[1]);
		 System.out.println(arrInt[2]);
		try {
			 System.out.println(arrInt[4]);
		}catch(Exception x) {
			
		}
		 System.out.println("Tra the ATM");
	}
	
	//vi du phep chia cho 0 va viec dung chuong trinh dot ngot
	public static void study001(){
		System.out.println("Nhan the ATM");
//		try
//		System.out.println(5/0);
				
		System.out.println("Tra the ATM");
	}
}
