package pl.sda.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by RENT on 2017-01-25.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
    double temp;

    public Main() {
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Main{" +
                "temp=" + temp +
                '}';
    }
}
