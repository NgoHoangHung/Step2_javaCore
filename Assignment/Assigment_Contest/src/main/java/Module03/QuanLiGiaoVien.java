package Module03;

public class QuanLiGiaoVien {
    private int maxTeacher = 50;
    private int totalTeacher = 0;
    private TienLuongGiaoVien[] tlgvObj = null;

    public QuanLiGiaoVien() {
        tlgvObj = new TienLuongGiaoVien[maxTeacher];
    }

    public int getTotalTeacher() {
        return totalTeacher;
    }

    public void setTotalTeacher(int totalTeacher) {
        this.totalTeacher = totalTeacher;
    }

    public int getTeacherPosition(String ID) {
        for (int i = 0; i < totalTeacher; i++) {
            if (ID.equalsIgnoreCase(tlgvObj[i].getTeacherId()))
                return i;
        }
        return -1;
    }

    public void add(TienLuongGiaoVien cbgvObj) {
        this.tlgvObj[totalTeacher] = cbgvObj;
        this.totalTeacher++;
        System.out.println("Add Success");
    }

    public void delete(String teacherId) {
        int teacherPosition = getTeacherPosition(teacherId);
        if (teacherPosition == -1)
            System.out.println("Không tồn tại giá trị tham chiếu");
        else {

            for (int i = teacherPosition; i < totalTeacher - 1; i++) {
                tlgvObj[i] = tlgvObj[i + 1];
            }
        }
    this.setTotalTeacher(getTotalTeacher()-1);
    }

    public void showInfo() {
    }

    public void request() {
    }

}
