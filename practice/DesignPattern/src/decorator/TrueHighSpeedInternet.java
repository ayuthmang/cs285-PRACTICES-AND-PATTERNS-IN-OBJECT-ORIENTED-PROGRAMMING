package decorator;

public class TrueHighSpeedInternet extends ExtraPackage {

    public TrueHighSpeedInternet(TruePackage myBasePackage) {
        super(myBasePackage);
    }

    @Override
    public String getName() {
        return super.myBasePackage.getName() + " " + "True High Speed Internet Package";
    }

    @Override
    public double getPrice() {
        return 499;
    }

    @Override
    public int getPrivilege() {
        return 30;
    }

}
