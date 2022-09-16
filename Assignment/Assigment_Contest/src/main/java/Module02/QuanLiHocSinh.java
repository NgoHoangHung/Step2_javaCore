package Module02;

public class QuanLiHocSinh {
    private int totalStudent = 0;
    private int maxStudent = 50;
    private LopHoc[] studentManagerObj = null;

    public QuanLiHocSinh() {
        this.studentManagerObj = new LopHoc[maxStudent];
    }

    public int getTotalStudent() {
        return totalStudent;
    }

    public void setTotalStudent(int totalStudent) {
        this.totalStudent = totalStudent;
    }

    public int getStudentPosition(String name) {
        for (int i = 0; i < studentManagerObj.length; i++) {
            if (name.equalsIgnoreCase(this.studentManagerObj[i].getName()))
                return i;
        }
        return -1;
    }

    public void add(LopHoc classObj) {
        studentManagerObj[totalStudent] = classObj;
        this.totalStudent++;
        System.out.println("Add succesful");
    }

    public void edit(String name) {

    }

    public void delete(String name) {
    }

    public void find(String name) {
    }

    public void showInfo() {
        for (int i = 0; i < this.getTotalStudent(); i++) {
            System.out.println(this.studentManagerObj[i]);
        }
    }

    public void showInfoAge() {
        for (int i = 0; i < this.getTotalStudent(); i++) {
            if (studentManagerObj[i].getAge() == 20)
                System.out.println(this.studentManagerObj[i]);
        }
    }

    public void showInfoAgeHomeTown() {
        boolean checkIsEmpty = true;
        String homeTowntmp = "Da Nang";
        for (int i = 0; i < this.getTotalStudent(); i++) {
            if (studentManagerObj[i].getAge() == 23&&homeTowntmp.equalsIgnoreCase(studentManagerObj[i].getHomeTown()) ) {
                    System.out.println(this.studentManagerObj[i]);
                    checkIsEmpty = false;
            }
        }
        if(checkIsEmpty){
            System.out.println("Không có học sinh cần tìm kiếm");
        }
    }


}
