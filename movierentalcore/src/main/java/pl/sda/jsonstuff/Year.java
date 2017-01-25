package pl.sda.jsonstuff;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by RENT on 2017-01-24.
 */
public class Year {
    int status;
    Map<String, List<Holiday>> holidays;

    public Year() {
    }

    @Override
    public String toString() {
        return "Year{" +
                "status=" + status +
                ", holidays=" + holidays +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Map<String, List<Holiday>> getHolidays() {
        return holidays;
    }

    public void setHolidays(Map<String, List<Holiday>> holidays) {
        this.holidays = holidays;
    }
}
