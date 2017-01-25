package pl.sda;

/**
 * Created by RENT on 2017-01-24.
 */
public class CreditCard {
    String number;
    String money;
    String currency;

    public CreditCard() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number=" + number +
                ", money=" + money +
                ", currency='" + currency + '\'' +
                '}';
    }
}
