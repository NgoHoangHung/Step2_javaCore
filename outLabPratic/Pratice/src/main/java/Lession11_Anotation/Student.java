package Lession11_Anotation;

public class Student extends Person {
        private String school;

    public Student(String name, String address, int age, String school) {
        super(name, address, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
@Override
    public void display(){
        super.display();
    System.out.println("Student.display " + getSchool());
    }
}
