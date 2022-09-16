package OOP.oop;

import java.util.Calendar;

public class Student {
	public int year;
	public String name;
	public String code;
	//constructor
	public Student() {
		this.year = 2000;
		this.name = "Sv Hung";
		this.code = "Sv Code";
	}
	public Student(String vName, String vcode)
	{
		this.code = vcode;
		this.name = vName;
	}

	
	//setter
	
	public void setYear(int year) {
		this.year = year;
	}
	
	

	public void setName(String name) {
		this.name = name;}
	
	public void setCode(String vcode) {
		this.code = vcode;
	}
	
	public void setcode(int number)
	{
		this.code = "SV" + number;
	}
	
	public void setcode(String str, int number)
	{
		this.code = str+number;
	}
	//getter
	
	public String getCode() {
		return this.code;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getYear() {
		return this.year;
	}
	
	//Show Student Info()
 public void showInfo()
 {
	 	System.out.println("Name \t\t:" + this.getName());
		System.out.println("Ma Lop \t\t:"+ this.getCode());
		System.out.println("Nam sinh \t:"+ this.getYear());
		System.out.println("-----------------");		
 }
 
 public int getAge()
 {
	 //lay thoi gian hien tai
	Calendar now = Calendar.getInstance();
	return now.get(Calendar.YEAR) - this.getYear();
 }
}
