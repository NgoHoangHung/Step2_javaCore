package Assignment05On12th;

public class NhanVien extends CanBo{
    private String work;

    public NhanVien(String name, int age, String gender, String address, String work) {
        super(name, age, gender, address);
        this.work = work;
    }

}
