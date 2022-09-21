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
    String id;
    String name;
    String permanent;
    Address address;

    int[] phoneNumbers;

    String role;

    String[] cities;

    Properties properties;

//    class Address {
//        String street;
//        String city;
//        int zipcode;
//    }

    @Override
    public String toString() {
        return "Unit2{" +
                "id='" + id + "\n"+
                "\nname='" + name + '\'' +
                "\npermanent='" + permanent + '\'' +
                "\naddress=" + address +
                "\nphoneNumbers=" + Arrays.toString(phoneNumbers) +
                "\nrole='" + role +
                "\ncities=" + Arrays.toString(cities) +
                "\nproperties=" + properties +
                "}";
    }
}
