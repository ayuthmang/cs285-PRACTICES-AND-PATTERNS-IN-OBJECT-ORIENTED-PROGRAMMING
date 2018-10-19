package decorator;

public abstract class ExtraPackage extends TruePackage {

    protected TruePackage myBasePackage;

    public ExtraPackage(TruePackage myBasePackage) {
        this.myBasePackage = myBasePackage;
    }

    @Override
    public String getName() {
        return "Extra package";
    }

    @Override
    public double getTotalPrice() {
        return myBasePackage.getTotalPrice() + this.getPrice();
    }
}
