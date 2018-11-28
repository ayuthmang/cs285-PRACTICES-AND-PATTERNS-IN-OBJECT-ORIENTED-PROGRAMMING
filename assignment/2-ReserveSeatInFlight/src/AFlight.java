/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author User
 */
public class AFlight {

    private HashMap<String, String> seats;
    private String flightNO;

    public AFlight() {
        seats = new HashMap<String, String>();
        seats.put("A1", "Not Specified");
        seats.put("A2", "Not Specified");
        seats.put("A3", "Not Specified");
    }

    public AFlight(String flightNO) {
        this();
        this.flightNO = flightNO;
    }

    public String getFlightNO() {
        return flightNO;
    }

    public synchronized void reserveSeatForPassenger(String passengerName,
                                                     String flightNO,
                                                     String seatNO) {
        int count = 0;
        do {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

            if (this.flightNO.equals(flightNO) && seats.get(seatNO).equals("Not Specified")) {
//            try {
                System.out.println(Thread.currentThread().getName()
                        + " is reserving seat " + seatNO + " at"
                        + sdf.format(new Date()));

//                Thread.sleep((int) Math.random() * 100);

                seats.put(seatNO, passengerName);

                System.out.println(Thread.currentThread().getName()
                        + " finally got " + seatNO + " for " + seats.get(seatNO)
                        + " at" + sdf.format(new Date()));
//            } catch (InterruptedException ex) {
//                Logger.getLogger(AFlight.class.getName()).log(Level.SEVERE, null, ex);
//            }
                break;
            } else {
                try {
                    System.out.println(Thread.currentThread().getName()
                            + " failed to reserve seat " + seatNO + " at"
                            + sdf.format(new Date())
                            + " since Seat: " + seatNO
                            + " already reserved for " + seats.get(seatNO));
//                    Thread.sleep(1000);
                    wait(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                count++;
            }
        } while (count < 10);
    }

    public synchronized void cancelSeatForPassanger(String flightNO, String seatNO) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        if (flightNO.equals(this.flightNO) && !seats.get(seatNO).equals("Not Specified")) {
            System.out.println(String.format("Canceling a seat for %s at %s.", seatNO, sdf.format(new Date())));
            seats.put(seatNO, "Not Specified");
            System.out.println(String.format("Canceling a seat for %s is finally canceled at %s.", seatNO, sdf.format(new Date())));

        } else {
            System.out.println("Seat " + seatNO + " is reserved for " + seats.get(seatNO));
        }
    }

    public void showSeatsStatus() {
        for (Map.Entry<String, String> aSeat : seats.entrySet()) {
            String seatNumber = aSeat.getKey();
            String passengerName = aSeat.getValue();

            System.out.println("Flight: " + flightNO + ",seatNumber" + seatNumber + " for " + passengerName);
        }
    }

}
