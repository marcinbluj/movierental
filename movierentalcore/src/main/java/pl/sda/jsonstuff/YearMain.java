package pl.sda.jsonstuff;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by RENT on 2017-01-24.
 */
public class YearMain {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonToPerson = "{\"status\":200,\"holidays\":{\"2016-01-01\":[{\"name\":\"Nowy Rok\",\"date\":\"2016-01-01\",\"observed\":\"2016-01-01\",\"public\":true}],\"2016-01-06\":[{\"name\":\"Święto Trzech Króli\",\"date\":\"2016-01-06\",\"observed\":\"2016-01-06\",\"public\":true}],\"2016-03-27\":[{\"name\":\"Niedziela Wielkanocna\",\"date\":\"2016-03-27\",\"observed\":\"2016-03-27\",\"public\":true}],\"2016-03-28\":[{\"name\":\"Poniedziałek Wielkanocny\",\"date\":\"2016-03-28\",\"observed\":\"2016-03-28\",\"public\":true}],\"2016-05-01\":[{\"name\":\"Święto Pracy\",\"date\":\"2016-05-01\",\"observed\":\"2016-05-01\",\"public\":true}],\"2016-05-03\":[{\"name\":\"Święto Narodowe Trzeciego Maja\",\"date\":\"2016-05-03\",\"observed\":\"2016-05-03\",\"public\":true}],\"2016-05-15\":[{\"name\":\"Zesłanie Ducha Świętego\",\"date\":\"2016-05-15\",\"observed\":\"2016-05-15\",\"public\":true}],\"2016-05-26\":[{\"name\":\"Dzień Bożego Ciała\",\"date\":\"2016-05-26\",\"observed\":\"2016-05-26\",\"public\":true}],\"2016-08-15\":[{\"name\":\"Wniebowzięcie Najświętszej Maryi Panny\",\"date\":\"2016-08-15\",\"observed\":\"2016-08-15\",\"public\":true}],\"2016-11-01\":[{\"name\":\"Uroczystość Wszystkich Świętych\",\"date\":\"2016-11-01\",\"observed\":\"2016-11-01\",\"public\":true}],\"2016-11-11\":[{\"name\":\"Narodowe Święto Niepodległości\",\"date\":\"2016-11-11\",\"observed\":\"2016-11-11\",\"public\":true}],\"2016-12-25\":[{\"name\":\"Pierwszy dzień Bożego Narodzenia\",\"date\":\"2016-12-25\",\"observed\":\"2016-12-25\",\"public\":true}],\"2016-12-26\":[{\"name\":\"Drugi dzień Bożego Narodzenia\",\"date\":\"2016-12-26\",\"observed\":\"2016-12-26\",\"public\":true}]}}";

        Year year = objectMapper.readValue(jsonToPerson, Year.class);
        System.out.println(year);
    }
}
