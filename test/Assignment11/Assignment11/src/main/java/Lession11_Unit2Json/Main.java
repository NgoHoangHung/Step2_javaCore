package Lession11_Unit2Json;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = "{\n" +
                "  \"id\": 123,\n" +
                "  \"name\": \"Pankaj\",\n" +
                "  \"permanent\": true,\n" +
                "  \"address\": {\n" +
                "    \"street\": \"Albany Dr\",\n" +
                "    \"city\": \"San Jose\",\n" +
                "    \"zipcode\": 95129\n" +
                "  },\n" +
                "  \"phoneNumbers\": [\n" +
                "    123456,\n" +
                "    987654\n" +
                "  ],\n" +
                "  \"role\": \"Manager\",\n" +
                "  \"cities\": [\n" +
                "    \"Los Angeles\",\n" +
                "    \"New York\"\n" +
                "  ],\n" +
                "  \"properties\": {\n" +
                "    \"age\": \"29 years\",\n" +
                "    \"salary\": \"1000 USD\"\n" +
                "  }\n" +
                "}";
        Unit2 newUnit2 = gson.fromJson(json,Unit2.class);
        System.out.println(newUnit2.toString());
    }

}
