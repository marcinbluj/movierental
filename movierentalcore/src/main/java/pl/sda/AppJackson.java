package pl.sda;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by RENT on 2017-01-23.
 */
public class AppJackson {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

//        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

//        String jsonString = "{\"customer\":{\"firstName\":\"Adam\",\"lastName\":\"Kowalski\",\"birthYear\":1980,\"idNumber\":123},\"startDate\":\"Jan 23, 2017 8:15:30 PM\",\"endDate\":\"Jan 23, 2017 8:15:30 PM\"}";
//        Rental rental = objectMapper.readValue(jsonString, Rental.class);
//        System.out.println(rental);

//        Customer customer = new Customer("Adam", "Kowalski", 1998, 123);
//        String customerJson = objectMapper.writeValueAsString(customer);
//        System.out.println(customerJson);
//
//        String json = "{\n" +
//                "  \"firstName\" : \"Adam\",\n" +
//                "  \"lastName\" : \"Kowalski\",\n" +
//                "  \"birthYear\" : 1998,\n" +
//                "  \"idNumber\" : 123\n" +
//                "}";
//
//        Customer customer1 = objectMapper.readValue(json, Customer.class);
//
//        System.out.println(customer1);

        String jsonToPerson = "{\n" +
                "  \"creditCards\":[\n" +
                "    {\n" +
                "      \"number\":\"123\",\n" +
                "      \"money\":\"123323\",\n" +
                "      \"currency\":\"PLN\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"number\":\"234\",\n" +
                "      \"money\":\"234323\",\n" +
                "      \"currency\":\"USD\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"owner\":{\n" +
                "    \"name\":\"Adam Kowalski\",\n" +
                "    \"city\":\"Wroclaw\"\n" +
                "  },\n" +
                "  \"id\":\"1234\"\n" +
                "}\n";

        Account account = objectMapper.readValue(jsonToPerson, Account.class);
        System.out.println(account);

        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("a", "b");
        stringStringMap.put("A", "B");
        stringStringMap.put("b", "c");
        stringStringMap.put("B", "C");

        String jsonMap = objectMapper.writeValueAsString(stringStringMap);
        System.out.println(jsonMap);

    }
}
