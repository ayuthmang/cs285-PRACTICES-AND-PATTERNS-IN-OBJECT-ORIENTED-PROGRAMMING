package observer;

import java.util.Observable;

public class Stock extends Observable {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        setChanged();
        notifyObservers();
        clearChanged();
    }
}
