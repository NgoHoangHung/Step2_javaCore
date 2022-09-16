package Module03;

public class TienLuongGiaoVien extends Person {
    private int salaryBasic;
    private int salaryBonus;
    private int penaltyMonney;


    public TienLuongGiaoVien(String name, int age, String homeTown, String teacherId, int salaryBasic, int salaryBonus, int penaltyMonney) {
        super(name, age, homeTown, teacherId);
        this.salaryBasic = salaryBasic;
        this.salaryBonus = salaryBonus;
        this.penaltyMonney = penaltyMonney;
    }

    public int getSalaryBasic() {
        return salaryBasic;
    }

    public void setSalaryBasic(int salaryBasic) {
        this.salaryBasic = salaryBasic;
    }

    public int getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(int salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    public int getPenaltyMonney() {
        return penaltyMonney;
    }

    public void setPenaltyMonney(int penaltyMonney) {
        this.penaltyMonney = penaltyMonney;
    }

    @Override
    public String toString() {
        return
                        "Name: " + getName() +
                        "\nAge: " + getAge() +
                        "\nHome Town: " + getHomeTown() +
                        "\nsalaryBasic=" + getSalaryBasic() +
                        "\nsalaryBonus=" + getSalaryBonus() +
                        "\npenaltyMonney=" + getPenaltyMonney() +
                        "\n";
    }
}


