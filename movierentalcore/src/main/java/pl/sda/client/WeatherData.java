package pl.sda.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by RENT on 2017-01-25.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {
    Main main;

    public WeatherData() {
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "main=" + main +
                '}';
    }
}
