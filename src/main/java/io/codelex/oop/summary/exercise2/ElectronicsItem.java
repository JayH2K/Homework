package io.codelex.oop.summary.exercise2;

import java.text.DecimalFormat;

public class ElectronicsItem extends AbstractItem {
    DecimalFormat decimalFormat = new DecimalFormat("#.00");

    private final int power;

    public ElectronicsItem(String name, double price, int power) {
        super(name, price);
        this.power = power;
    }

    public String fullInfo() {
        return getName() + ", " + decimalFormat.format(getPrice()) + " EUR, power: " + power + "W";
    }
}
