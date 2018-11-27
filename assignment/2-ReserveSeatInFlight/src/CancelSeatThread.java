public class CancelSeatThread extends Thread {

    private AFlight flight;
    private String passengerName;
    private String seatNO;

    public CancelSeatThread(AFlight flight, String passengerName, String seatNO) {
        this.flight = flight;
        this.passengerName = passengerName;
        this.seatNO = seatNO;
    }

    @Override
    public void run() {
        super.run();
        try {
            this.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //    ให้สร้าง Thread อีกหนึ่ง Thread เพื่อ Sleep เป็นเวลา 1 วินาที เพื่อ Cancel การจองที่นั่ง หมายเลข A3 ที่มีการจอง ให้เป็น Not Specified
}
