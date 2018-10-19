package com.company;

public class TrueVision extends ExtraPackage implements TruePackage {
    @Override
    public String getName() {
        return "True Vision Package";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 699;
    }

    @Override
    public int getPrivilege() {
        return 20;
    }
}
