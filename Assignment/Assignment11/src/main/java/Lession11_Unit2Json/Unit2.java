package Lession11_Unit2Json;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Unit2 {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("permanent")
    private String permanent;
    @SerializedName("address")
    private Address address;
    @SerializedName("phoneNumbers")
    private int[] phoneNumbers;
    @SerializedName("role")
    private String role;
    @SerializedName("cities")
    private String[] cities;
    @SerializedName("properties")
    private Properties properties;

    @Override
    public String toString() {
        return "Unit2{" +
                "id='" + getId() + "\n" +
                "\nname='" + getName() + '\'' +
                "\npermanent='" + getPermanent() + '\'' +
                "\naddress=" + getAddress() +
                "\nphoneNumbers=" + Arrays.toString(phoneNumbers) +
                "\nrole='" + getRole() +
                "\ncities=" + Arrays.toString(cities) +
                "\nproperties=" + getProperties() +
                "}";
    }
}
