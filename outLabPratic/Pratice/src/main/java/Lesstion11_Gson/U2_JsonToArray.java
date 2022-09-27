package Lesstion11_Gson;

import java.io.File;
import java.io.IOException;

public class U2_JsonToArray {
    public static void main(String[] args) {
        try{
            File jsonFile = new File("H:\\Hoc tap\\1.FullStack\\java14\\Step2_javaCore\\outLabPratic\\Pratice\\U2_Json.json");
            if(jsonFile.createNewFile()){
                System.out.println("File is created!");
            }
            else{
                System.out.println("File already exists");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
/*
Để tạo ra được một mảng các đối tượng từ file Json, ta sẽ tạo ra một file json trước để có
 thông tin về các đối tượng rồi sau đấy ta mới tạo được mảng
 */
