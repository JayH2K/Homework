package io.codelex.oop.summary.exercise2;

import java.text.DecimalFormat;

class HouseholdItem extends AbstractItem {
    DecimalFormat decimalFormat = new DecimalFormat("#.00");

    private String color;

    public HouseholdItem(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    public String fullInfo() {
        return getName() + ", " + decimalFormat.format(getPrice()) + " EUR, color: " + color;
    }
}
