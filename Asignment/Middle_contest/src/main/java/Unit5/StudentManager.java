package Unit5;

public class StudentManager extends Student {
    private String studentClass;

    public StudentManager(String name, int age, String town, String studentClass) {
        super(name, age, town);
        this.studentClass = studentClass;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

}
