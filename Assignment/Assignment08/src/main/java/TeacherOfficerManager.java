import java.util.ArrayList;
import java.util.List;

public class TeacherOfficerManager {
    static ArrayList<TeacherOfficer> teacherOfficerManager ;
    public TeacherOfficerManager() {
      teacherOfficerManager = new ArrayList<TeacherOfficer>(100);
    }

    public  void creat(TeacherOfficer teacherOfficerTmp) {
        teacherOfficerManager.add(teacherOfficerTmp);
    }

    public  void request(String teacherId) {
        ArrayList<TeacherOfficer> teacherOfficerArrayListTmp = new ArrayList<TeacherOfficer>();
        for (int i = 0; i <teacherOfficerManager.size(); i++) {
                if(teacherOfficerManager.get(i).getPersonIdentification().contains(teacherId)){
                    teacherOfficerArrayListTmp.add(teacherOfficerManager.get(i));
                    System.out.println(teacherOfficerManager.get(i).toString());
                }
        }
    }

    public  void update() {
        System.out.println("TeacherOfficerManager.update");
    }

    public  void delete(String teacherId) {
        for (int i = 0; i <teacherOfficerManager.size(); i++) {
            if(teacherOfficerManager.get(i).getPersonIdentification().contains(teacherId)){
                teacherOfficerManager.remove(teacherOfficerManager.get(i));
            }
    }
    }

    public  void showInfo() {
        for (int i = 0; i <teacherOfficerManager.size(); i++) {
            System.out.println(teacherOfficerManager.get(i).toString());

        }
    }

//    public  void salaryResul() {
//        for (int i = 0; i <teacherOfficerManager.size(); i++) {
//            teacherOfficerManager.get(i).setTotalSalary(teacherOfficerManager.get(i).getBaseSalary() + teacherOfficerManager.get(i).getBonusSalary()
//            -teacherOfficerManager.get(i).getPenatyMoney())  ;
//            }
//        }

    }

