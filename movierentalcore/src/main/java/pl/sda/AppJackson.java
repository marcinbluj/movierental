package pl.sda;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by RENT on 2017-01-23.
 */
public class AppJackson {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String jsonString = "{\"customer\":{\"firstName\":\"Adam\",\"lastName\":\"Kowalski\",\"birthYear\":1980,\"idNumber\":123},\"startDate\":\"Jan 23, 2017 8:15:30 PM\",\"endDate\":\"Jan 23, 2017 8:15:30 PM\"}";

        Rental rental = objectMapper.readValue(jsonString, Rental.class);
        System.out.println(rental);
    }
}
