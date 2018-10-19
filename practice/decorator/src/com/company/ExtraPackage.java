package com.company;

public class ExtraPackage implements TruePackage {

    public TruePackage myBasePackage;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public int getPrivilege() {
        return 0;
    }
}
