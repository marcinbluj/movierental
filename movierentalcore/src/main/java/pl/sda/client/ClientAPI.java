package pl.sda.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;

public class ClientAPI {

    public static void main(String[] args) throws UnirestException, IOException {




        ObjectMapper objectMapper = new ObjectMapper();



        String body = Unirest.get("http://192.168.2.17:8080/customers/sdfsdf").asString().getBody();
        System.out.println("body " + body);

        String json = "{\n" +
                "\"firstName\": \"Adasssm\",\n" +
                "\"lastName\": \"Mickiewicz\",\n" +
                "\"birthYear\": 1798,\n" +
                "\"height\": 1.7,\n" +
                "\"id\": \"89d64f7e-9b95-4985-85a7-6fe23eb1ae8f\"\n" +
                "}\n";

        String body1 = Unirest.post("http://192.168.2.17:8080/customers/123455321").header("Content-Type", "application/json").body(json).asString().getBody();
        System.out.println(body1);

        Customer customer = objectMapper.readValue(body, Customer.class);
        System.out.println(customer.toString());

    }
}
