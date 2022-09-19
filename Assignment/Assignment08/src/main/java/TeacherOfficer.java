public class TeacherOfficer extends Person {
    private int baseSalary;
    private int bonusSalary;
    private int penatyMoney;
    private int totalSalary;

    public TeacherOfficer(String name, int age, String homeTown, String personIdentification, int baseSalary, int bonusSalary, int penatyMoney) {
        super(name, age, homeTown, personIdentification);
        this.baseSalary = baseSalary;
        this.bonusSalary = bonusSalary;
        this.penatyMoney = penatyMoney;
        this.totalSalary = totalSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public int getPenatyMoney() {
        return penatyMoney;
    }

    public void setPenatyMoney(int penatyMoney) {
        this.penatyMoney = penatyMoney;
    }

    public int getTotalSalary() {
        return this.getBaseSalary()+this.getBonusSalary()-this.getPenatyMoney();
    }

    public void setTotalSalary(int totalSalary) {
//        totalSalary = this.getBaseSalary()+this.getBonusSalary()-this.getPenatyMoney();
        this.totalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return
                "name= " + super.getName() +
                        "\n age= " +  super.getAge() +
                        "\n homeTown= " + super.getHomeTown()  +
                        "\n personIdentification= " + super.getPersonIdentification() +
                        "\nbaseSalary= " + baseSalary +
                        "\nbonusSalary= " + bonusSalary +
                        "\npenatyMoney= " + penatyMoney +
                        "\n totalMoney= " + this.getTotalSalary() +
                        "\n___________________________________\n";
    }
}
