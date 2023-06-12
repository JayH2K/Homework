package io.codelex.oop.summary.exercise2;

import java.text.DecimalFormat;

class FoodItem extends AbstractItem {
    DecimalFormat decimalFormat = new DecimalFormat("#.00");

    public String getBestBefore() {
        return bestBefore;
    }

    private final String bestBefore;

    public FoodItem(String name, double price, String bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    public String fullInfo() {
        return getName() + ", " + decimalFormat.format(getPrice()) + " EUR, best before: " + bestBefore;
    }
}