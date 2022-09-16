package chap05.String;

public class A2_StrBuilder {
	public static void main(String[] args) {
		StringBuilder strBuilderobj = new StringBuilder("Javaewrtewrte");
		System.out.println(strBuilderobj);
		//append(strBuilderobj);
		insert(strBuilderobj);
//		deleteCharAt(strBuilderobj);
//		delete(strBuilderobj);
		
		
	}
	
	public static void append(StringBuilder obj) {
		obj.append("_easy_");
		System.out.println(obj);
	}
	
	public static void insert(StringBuilder obj) {
		obj.insert(5, "_is very_");
		System.out.println(obj);
	}
	
	public static void deleteCharAt(StringBuilder obj) {
		obj.deleteCharAt(0);
		obj.deleteCharAt(obj.length()-1);
		System.out.println(obj);
	}
	
	public static void delete(StringBuilder obj) {
		obj.delete(2 , 9+1);
		System.out.println(obj);
	}
}
