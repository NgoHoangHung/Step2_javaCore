package Lession11_InterfaceAnotation;

import java.util.ArrayList;
import java.util.Collections;

public class Unit1_ComparableInterfaceMain {
    public static void main(String[] args) {
        ArrayList<Unit1_UserVarable> userVarables = new ArrayList<>();
        userVarables.add(new Unit1_UserVarable("Ngọc Anh", 25, "Hanoi"));
        userVarables.add(new Unit1_UserVarable("Tú", 25, "Hanoi"));
        userVarables.add(new Unit1_UserVarable("Vương", 25, "Hanoi"));
        userVarables.add(new Unit1_UserVarable("Hùng", 25, "Hanoi"));
        userVarables.add(new Unit1_UserVarable("Thọ", 25, "Hanoi"));
        userVarables.add(new Unit1_UserVarable("Tiến", 25, "Hanoi"));
        userVarables.add(new Unit1_UserVarable("Trung", 25, "Hanoi"));
        userVarables.add(new Unit1_UserVarable("Yến", 25, "Hanoi"));
        Collections.sort(userVarables);
        myprint(userVarables);
    }
    public static void myprint( ArrayList<Unit1_UserVarable> userObj){
        for (Unit1_UserVarable userVarable : userObj) {
            System.out.println("name: " + userVarable.getName() +
                    "\nage" + userVarable.getAge() +
                    "\naddress: " + userVarable.getAddress() + "\n___________________________________________\n");
        }
    }
}
