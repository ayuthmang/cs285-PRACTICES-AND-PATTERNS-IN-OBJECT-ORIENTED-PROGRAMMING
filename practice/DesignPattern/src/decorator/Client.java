package decorator;

public class Client {
    private TruePackage truePackage;

    public Client() {
        truePackage = null;
    }

    public void openAccount() {
        truePackage = new TrueMove();
    }

    public void addPackage(PromotionType promotionType) {
        switch (promotionType) {
            case TrueVision:
                truePackage = new TrueVision(this.truePackage);
                break;
            case TrueHighSpeedInternet:
                truePackage = new TrueHighSpeedInternet(this.truePackage);
                break;
            default:
                break;
        }
    }

    public String listPackage() {
        return truePackage.getName();
    }

    public double getPriceToPay() {
        return truePackage.getTotalPrice();
    }

    public int getPrivilege() {
        return truePackage.getPrivilege();
    }

}
