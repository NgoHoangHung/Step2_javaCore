package Lesstion11_Gson;

public class Lession1 {
    private String id;
    private int number;
    private String age;

    public Lession1(){

    }
    public Lession1(String id, int number, String age) {
        this.id = id;
        this.number = number;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "lession1{" +
                "id='" + id + '\'' +
                ", number=" + number +
                ", age='" + age + '\'' +
                '}';
    }
}
