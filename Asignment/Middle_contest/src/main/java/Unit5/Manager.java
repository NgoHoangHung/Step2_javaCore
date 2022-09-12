package Unit5;

import java.util.Arrays;

public class Manager {
    private int maxStudent = 50;
    private int totalStudent = 0;
    private StudentManager[] studentManagers = null;

    public Manager() {
        studentManagers = new StudentManager[maxStudent];
    }

    public void add(StudentManager studentManagersObj){
        this.studentManagers[totalStudent] = studentManagersObj;
        this.totalStudent++;
    }
    public void display(){
        for (int i = 0; i < getTotalStudent(); i++) {
            System.out.println("Name: "+studentManagers[i].getName());
            System.out.println("Age: "+studentManagers[i].getAge());
            System.out.println("Town: "+studentManagers[i].getTown());
            System.out.println("Class: "+studentManagers[i].getStudentClass());

        }
    }

    public int getTotalStudent() {
        return totalStudent;
    }



}




