package observer;

import java.util.Observable;

public class MaoInvestor implements IInvestor {

    private Stock stock;
    private String investorName;
    private double boughtPrice;

    public MaoInvestor(Stock stock, String investorName) {
        this.stock = stock;
        this.investorName = investorName;
        this.boughtPrice = stock.getPrice();
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Stock) {
            if (((Stock)o).getPrice() > boughtPrice) {
                System.out.println(String.format("%s will sell the %s stocks at %.02f.", investorName, stock.toString(), stock.getPrice()));
            } else {
                System.out.println(String.format("%s will buy the %s stocks at %.02f.", investorName, stock.toString(), stock.getPrice()));
            }
        }
    }
}
