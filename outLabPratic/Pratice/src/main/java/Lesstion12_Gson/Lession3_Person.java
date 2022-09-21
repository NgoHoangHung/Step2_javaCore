package Lesstion12_Gson;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Lession3_Person {
        @SerializedName("name")
    private String fullname;
        @SerializedName("email")
    private String email;
        @SerializedName("phoneNumber")
    private String mobile;

    @Override
    public String toString() {
        return
                "fullname= " + getFullname() +
                "\nemail= " + getEmail() +
                "\nmobile= " + getMobile();
    }
}
