package command;

public class Calculator {
    protected double state;

    // Action of Receiver
    public double add(double x, double y) {
        return x + y;
    }

    // Action of Receiver
    public double subtract(double x, double y) {
        return x - y;
    }
}
