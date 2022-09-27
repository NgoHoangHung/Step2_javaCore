 package Lesstion11_Gson;

 import com.google.gson.annotations.SerializedName;
 import lombok.*;

 @NoArgsConstructor@AllArgsConstructor@Getter@Setter
 @ToString
public class U1_Person{
@SerializedName("name")
    private String fullName;
    private String email;
    private String address;
}