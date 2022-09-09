package Assignment06thUnit1;

public class StudentManager {
    private String name;
    private int age;
    private String classID;

    public StudentManager(String name, int age, String classID) {
        this.name = name;
        this.age = age;
        this.classID = classID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }
}
