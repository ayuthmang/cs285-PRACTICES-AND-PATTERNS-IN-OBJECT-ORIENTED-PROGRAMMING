import com.sun.corba.se.spi.orbutil.threadpool.ThreadPoolManager;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CancelSeatThread extends Thread {

    private AFlight flight;
    private String seatNO;

    public CancelSeatThread(AFlight flight, String seatNO) {
        this.flight = flight;
        this.seatNO = seatNO;
    }

    @Override
    public void run() {
        super.run();
        try {
            this.sleep(1000);
            flight.cancelSeatForPassanger(flight.getFlightNO(), seatNO);
        } catch (InterruptedException ex) {
            Logger.getLogger(BuyFlightTicketThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
