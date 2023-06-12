package io.codelex.oop.summary.exercise2;

import java.text.DecimalFormat;

public class ItemPacking implements Service {
    DecimalFormat decimalFormat = new DecimalFormat("#.00");

    static final String name = "Item Packing";

    static final int price = 5;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String fullInfo() {
        return name + ", " + decimalFormat.format(getPrice()) + "EUR";
    }
}
