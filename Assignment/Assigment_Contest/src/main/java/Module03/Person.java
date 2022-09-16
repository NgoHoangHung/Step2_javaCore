package Module03;

public class Person extends Module02.HocSinh {
    private String teacherId;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public Person(String name, int age, String homeTown,String teacherId) {
        super(name, age, homeTown);
        this.teacherId = teacherId;
    }
}
