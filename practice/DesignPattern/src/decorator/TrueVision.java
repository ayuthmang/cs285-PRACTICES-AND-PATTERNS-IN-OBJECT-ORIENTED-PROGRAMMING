package decorator;

public class TrueVision extends ExtraPackage {

    public TrueVision(TruePackage myBasePackage) {
        super(myBasePackage);
    }

    @Override
    public String getName() {
        return super.myBasePackage.getName() + " " + "True Vision Package";
    }

    @Override
    public double getPrice() {
        return 699;
    }

    @Override
    public int getPrivilege() {
        return 20;
    }

}
