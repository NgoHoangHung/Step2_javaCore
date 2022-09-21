package Lesstion12_Gson;
import com.google.gson.Gson;

public class Lession2 {
    public static void main(String[] args) {
        //Tạo đối tượng Gson
        Gson gson = new Gson();
        Lession1 lession = new Lession1("A01",5,"xx");
        //Chuyển đổi từ Object sang JSON
        String result = gson.toJson(lession);
        System.out.println(result);
    }
}
