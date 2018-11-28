/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            try {
                AFlight f1 = new AFlight("TG930");

                Thread instructorReserveSeatThread = new BuyFlightTicketThread(f1, "Songsakdi", "A1");
                instructorReserveSeatThread.setName("Reserve for Ajarn");

                Thread presidentReserveSeatThread = new BuyFlightTicketThread(f1, "ประยุทธ์", "A1");
                presidentReserveSeatThread.setName("Reserve for Thailand's Prime Minister");

                Thread cancelSeatThread = new CancelSeatThread(f1, "A1");
                cancelSeatThread.setName("Cancel a seat thread");

                presidentReserveSeatThread.start();
                instructorReserveSeatThread.start();
                cancelSeatThread.start();

                presidentReserveSeatThread.join();
                instructorReserveSeatThread.join();
                cancelSeatThread.join();

                System.out.println("+++++++++++++++++++++++++++");
                System.out.println("Round " + i + ":");
                f1.showSeatsStatus();
                System.out.println("+++++++++++++++++++++++++++");

            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
