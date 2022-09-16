package OOP.oop;



//public class Student13 {
//    int id;
//    String name;
// 
//    Student13() {
//        System.out.println("call Constructor mặc định");
//    }
// 
//    Student13(int id, String name) {
//        this(); // nó được sử dụng để gọi Constructor của lớp hiện tại
//        this.id = id;
//        this.name = name;
//    }
// 
//    void display() {
//        System.out.println(id + " " + name);
//    }
// 
//    public static void main(String args[]) {
//        Student13 e1 = new Student13(111, "Viet");
//        Student13 e2 = new Student13(222, "Nam");
//        e1.display();
//        e2.display();
//    }
//}
class A5{
void m() {
	  System.out.println(this); //in ra cung tham chieu ID  
	 }
	 
	 public static void main(String args[]) {
	  A5 obj = new A5();
	  System.out.println(obj); //in tham chieu ID  
	 
	  obj.m();
	 }
	}