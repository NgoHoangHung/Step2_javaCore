package Lesstion12_Gson;

import com.google.gson.Gson;

public class Lession3_JsonToJavaObj_Contrary {
    public static void main(String[] args) {
        String json = "{\"name\":\"Kanya Fearnsides\",\"email\":\"kfearnsides0@washingtonpost.com\",\"phoneNumber\":\"7882735892\"} ";
        Gson gson = new Gson();
        Lession3_Person person = new Lession3_Person();
        Lession3_Person newPerson = gson.fromJson(json, Lession3_Person.class);
        System.out.println(newPerson.toString());
//        System.out.println(newPerson.getFullname() + "-" + newPerson.getEmail() + "-" + newPerson.getMobile());

        System.out.println("__________________________");
        Lession3_Person personObj = new Lession3_Person("Hung","nhhung125@gmail.com","0973024688");
        String result = gson.toJson(personObj);
        System.out.println(result);
    }
}
