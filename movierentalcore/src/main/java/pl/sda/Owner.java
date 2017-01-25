package pl.sda;

/**
 * Created by RENT on 2017-01-24.
 */
public class Owner {
    String name;
    String city;

    public Owner() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
