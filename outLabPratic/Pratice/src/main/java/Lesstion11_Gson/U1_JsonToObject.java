package Lesstion11_Gson;

import Lesstion11_Anotation.Person;
import com.google.gson.Gson;

public class U1_JsonToObject {
    public static void main(String[] args) {
        String json = "{\"name\":\"Kaitlynn Vandenhoff\",\"" +
                "email\":\"kvandenhoff0@github.io\",\"" +
                "address\":\"25158 Truax Terrace\"}";
        Gson gsonObj = new Gson();
        U1_Person personObj = gsonObj.fromJson(json,U1_Person.class);
        System.out.println(personObj.toString());
/*
Để sử dụng được các phương thức của gson thì ta sẽ phải tạo đối tượng gson.
Để chuyển đổi một chuỗi jSon sang một đối tượng object thì ta có phương thức là fromSon()

 */
    }
}
