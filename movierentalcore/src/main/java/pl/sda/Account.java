package pl.sda;

import java.util.List;

/**
 * Created by RENT on 2017-01-24.
 */
public class Account {
    List<CreditCard> creditCards;
    Owner owner;
    String id;

    public Account() {
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "creditCards=" + creditCards +
                ", owner=" + owner +
                ", id=" + id +
                '}';
    }
}
