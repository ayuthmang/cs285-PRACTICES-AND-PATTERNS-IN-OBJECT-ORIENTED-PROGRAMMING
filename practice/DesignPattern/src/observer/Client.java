package observer;

public class Client {
    public static void main(String ... args) {
        Apple appleStock = new Apple();
        appleStock.setPrice(100);

        MaoInvestor baby = new MaoInvestor(appleStock, "Baby");
        MaoInvestor songsakdi = new MaoInvestor(appleStock, "Songsakdi");

        appleStock.addObserver(baby);
        appleStock.addObserver(songsakdi);
        appleStock.setPrice(200);
        appleStock.deleteObserver(baby);
//        appleStock.deleteObserver(songsakdi);
        appleStock.setPrice(500);
    }
}
