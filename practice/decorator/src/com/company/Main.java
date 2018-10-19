package com.company;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        // After opening an account, Main Service of each client is TrueMove
        client.openAccount();
        // Client can add or remove service package such as HighSpeedInternet or ..
        client.addPackage(PromotionType.TrueVision);
        client.addPackage(PromotionType.HighSpeedInternet);

        System.out.println(client.listPackage());
        System.out.println(client.getPriceToPay()); // แสดงราคา 1698 บาท (500 + 699 + )
        System.out.println(client.getPrivilege());  // โทรฟรี 50 นาที (20 + 30)
    }
}
