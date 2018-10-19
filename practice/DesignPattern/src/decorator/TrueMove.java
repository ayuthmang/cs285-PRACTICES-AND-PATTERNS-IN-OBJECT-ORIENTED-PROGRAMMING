package decorator;

public class TrueMove extends TruePackage {
    @Override
    public String getName() {
        return "TrueMove Package";
    }

    @Override
    public double getPrice() {
        return 500;
    }

    @Override
    public int getPrivilege() {
        return 0;
    }

    @Override
    public double getTotalPrice() {
        return this.getPrice();
    }
}
