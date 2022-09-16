package Module02;

public class LopHoc extends HocSinh{
    private String studentClass;

    public LopHoc(String name, int age, String homeTown, String studentClass) {
        super(name, age, homeTown);
        this.studentClass = studentClass;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "studentClass=" + getStudentClass() +"\nName: " + getName()+"\nAge: " + getAge()+"\nHome Town: " + getHomeTown() + "\n";
    }
}
