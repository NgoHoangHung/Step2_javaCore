package chap05.String;
import java.util.Scanner;
import java.lang.StringBuilder;
public class A6_MakeRegularString extends A1_StrBasic {
	public static void main(String[] args) {
		study002_Standard2();
		
	}
	public static void study002_Standard2() {
		String str = "     " + " java      is      exciteAFASD           language            program" + "       ....................";
		//khong co khoang trang o dau chuoi va cuoi chuoi
		str = str.trim();
	
		//giua cac tu trong chuoi chi ton tai mot khoang trang duy nhat
		str = str.replaceAll("\\s+\\.+",".");
		if(str.charAt(str.length()-1) != '.') str = str + ".";
		
		//cac ki tu o moi tu phai duoc viet hoa
		String[] Stringarr = str.split("\\s+");
		StringBuilder StrResult = new StringBuilder();
//		for(String elme:Stringarr) {
//			String StrTmp =  elme.substring(0, 1).toUpperCase() + elme.substring(1).toLowerCase();
//			StrResult.append(StrTmp).append(" ");
//		}
		for (int i = 0; i< Stringarr.length; i++) {
			String StrTmp =  Stringarr[i].substring(0, 1).toUpperCase() + Stringarr[i].substring(1).toLowerCase();
			if(i == Stringarr.length-1) {
			
				StrResult.append(StrTmp);
			}
			else {
				
				StrResult.append(StrTmp).append(" ");
			}
		}
		
		System.out.print(StrResult);
		
	}
	
	public static void study001_Standard1() {
		String str = "     " + " java      is      excite           language            program" + "       ....................";
		System.out.println(str.length());
		//khong co khoang trang o dau chuoi
		str = str.trim();
		System.out.println(str);
		System.out.println(str.length());
	
		//giua cac tu trong chuoi chi ton tai mot khoang trang duy nhat
		str = str.replaceAll("\\s+"," ");
		str = str.replaceAll("\\s+\\.+",".");
		System.out.println(str);
		System.out.println(str.length());
		
		//Ki tu dau tien trong chuoi phai la ki tu in hoa
		//cac ki tu con lai o dang chu thuong
		str =  str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
		System.out.println(str);
		
		if(str.charAt(str.length()-1) != '.') 
			str = str + ".";
	}
	
}
















