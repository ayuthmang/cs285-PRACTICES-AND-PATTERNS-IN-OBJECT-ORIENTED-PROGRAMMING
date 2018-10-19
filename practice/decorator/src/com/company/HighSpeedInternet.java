package com.company;

public class HighSpeedInternet extends ExtraPackage implements TruePackage {
    @Override
    public String getName() {
        return "High Speed Internet Package";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 499;
    }

    @Override
    public int getPrivilege() {
        return 0;
    }
}
