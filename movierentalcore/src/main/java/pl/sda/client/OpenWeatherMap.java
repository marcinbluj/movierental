package pl.sda.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
//        http://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=092d3125cdc41f1041e68d1e5c74c4f1
//        System.out.println("Podaj nazwe miasta: ");
//        String city = new Scanner(System.in).nextLine();
//
//        WeatherData response = Unirest.get("http://api.openweathermap.org/data/2.5/weather")
//                .queryString("q", city + ",pl")
//                .queryString("appid", "092d3125cdc41f1041e68d1e5c74c4f1")
//                .asObject(WeatherData.class).getBody();
//
//
//        double v = response.getMain().getTemp() - 273.15;
//        System.out.println("" + v);





//        int lat = 51;
//        int lon = 17;

//        System.out.println("Podaj lat: ");
//        double lat = new Scanner(System.in).nextDouble();
//        System.out.println("Podaj lon: ");
//        double lon = new Scanner(System.in).nextDouble();
//        JsonNode jsonNode = Unirest.get("http://api.openweathermap.org/data/2.5/weather")
//                .queryString("lat", lat)
//                .queryString("lon", lon)
//                .queryString("appid", "092d3125cdc41f1041e68d1e5c74c4f1")
//                .queryString("units", "metric")
//                .asJson().getBody();
//
//        System.out.println(jsonNode);
//
//        double v = (jsonNode.getObject().optJSONObject("main").optDouble("temp"));
//        String weather = jsonNode.getObject().optJSONArray("weather").getJSONObject(0).optString("description");
//        System.out.println(v + " C weather: " + weather);





//        9dd02faf-1f2f-4ca4-aaf8-bf9b09c7421e
//        https://holidayapi.com/v1/holidays?key=9dd02faf-1f2f-4ca4-aaf8-bf9b09c7421e&country=PL&year=2016
//        https://holidayapi.com/v1/holidays

//        JsonNode jsonHolidays = Unirest.get("https://holidayapi.com/v1/holidays")
//                .queryString("key", "9dd02faf-1f2f-4ca4-aaf8-bf9b09c7421e")
//                .queryString("country", "PL")
//                .queryString("year", 2016)
//                .asJson().getBody();

//        System.out.println(jsonHolidays);




        JsonNode allCountries = Unirest.get("https://restcountries-v1.p.mashape.com/all")
                .header("X-Mashape-Key", "75OxkOZ1s1mshe3l4yFJ5tZipbLzp1EILbWjsndtHef2mTGQR8")
                .header("Accept", "application/json")
                .asJson().getBody();

        int length = allCountries.getArray().length();

        List<double[]> capitals = new ArrayList<>(length);

        for (int i = 0; i < length; i++) {

            double lat = allCountries.getArray().getJSONObject(i).optJSONArray("latlng").optDouble(0);
            double lng = allCountries.getArray().getJSONObject(i).optJSONArray("latlng").optDouble(1);

            capitals.add(new double[]{lat, lng});
        }


        for (int i = 0; i < 20; i++) {

            JsonNode cityWeather = Unirest.get("http://api.openweathermap.org/data/2.5/weather")
                    .queryString("lat", capitals.get(i)[0])
                    .queryString("lon", capitals.get(i)[1])
                    .queryString("appid", "092d3125cdc41f1041e68d1e5c74c4f1")
                    .queryString("units", "metric")
                    .queryString("lang", "pl")
                    .asJson().getBody();

            double tempCity = cityWeather.getObject().optJSONObject("main").optDouble("temp");
            String name = cityWeather.getObject().optString("name");
            System.out.println(name+" "+tempCity+ " C");
        }
    }
}
