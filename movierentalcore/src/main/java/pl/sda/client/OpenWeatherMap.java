package pl.sda.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.util.Scanner;

public class OpenWeatherMap {
    public static void main(String[] args) throws UnirestException {

        Unirest.setObjectMapper(new ObjectMapper() {
            private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper
                    = new com.fasterxml.jackson.databind.ObjectMapper();

            public <T> T readValue(String value, Class<T> valueType) {
                try {
                    return jacksonObjectMapper.readValue(value, valueType);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            public String writeValue(Object value) {
                try {
                    return jacksonObjectMapper.writeValueAsString(value);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            }
        });

//        http://api.openweathermap.org/data/2.5/weather?q=Wroclaw,pl&appid=092d3125cdc41f1041e68d1e5c74c4f1
        System.out.println("Podaj nazwe miasta: ");
        String city = new Scanner(System.in).nextLine();

        WeatherData response = Unirest.get("http://api.openweathermap.org/data/2.5/weather")
                .queryString("q", city + ",pl")
                .queryString("appid", "092d3125cdc41f1041e68d1e5c74c4f1")
                .asObject(WeatherData.class).getBody();


        System.out.println(response.getMain().getTemp()-273.5);


    }
}
