package chap06_OOP_Advance;

public class Course {
	private String name;
	private int time;
	
	
	public  Course(String name, int time) {
		this.name = name;
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return ("Course Info:\n - Name: \t" + this.getName() + "\n - Time: \t" + this.getTime());
	}
	@Override
	public boolean equals(Object obj) {
		Course courseObj = (Course) obj;
		if(this.getTime()== courseObj.getTime()) 
		return true;
		return false;
	}
}
