public class Person {

    private String name;
    private int age;
    private String homeTown;
    private String personIdentification;

    public Person(String name, int age, String homeTown, String personIdentification) {
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
        this.personIdentification = personIdentification;
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

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getPersonIdentification() {
        return personIdentification;
    }

    public void setPersonIdentification(String personIdentification) {
        this.personIdentification = personIdentification;
    }

    @Override
    public String toString() {
        return
                "name= " + name +
                "\n age= " + age +
                "\n homeTown= " + homeTown  +
                "\n personIdentification='" + personIdentification + "\n___________________________________\n" ;
    }
}
