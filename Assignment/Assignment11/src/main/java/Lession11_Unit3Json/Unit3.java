package Lession11_Unit3Json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Unit3 {
    public static void main(String[] args) {
        Gson gson= new Gson();
        String jsonCarStr ="[{ \"color\" : \"White\",\"type\" : \"Vinfast\" }, { \"color\" :\"Blue\", \"type\" : \"Toyota\" }]";
//        String jsonCarStr ="[{ "color" : "White","type" : "Vinfast" }, { "color" :"Blue", "type" : "Toyota" }]";
        ArrayList<Car> listObj   = new ArrayList<>();
        Type type = new TypeToken<ArrayList<Car>>(){}.getType();
        listObj = gson.fromJson(jsonCarStr,type);
        for (Car car : listObj) {
            System.out.println(car.toString());
        }
    }
}
