package pl.sda.jsonstuff;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by RENT on 2017-01-24.
 */
public class Holiday {
    String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd")
    Date date;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd")
    Date observed;
    @JsonProperty("public")
    boolean publicHoliday;

    public Holiday() {
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", observed=" + observed +
                ", publicHoliday=" + publicHoliday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getObserved() {
        return observed;
    }

    public void setObserved(Date observed) {
        this.observed = observed;
    }

    public boolean isPublicHoliday() {
        return publicHoliday;
    }

    public void setPublicHoliday(boolean publicHoliday) {
        this.publicHoliday = publicHoliday;
    }
}
