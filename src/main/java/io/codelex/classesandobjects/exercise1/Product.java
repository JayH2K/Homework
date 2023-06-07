package io.codelex.classesandobjects.exercise1;

import java.text.DecimalFormat;

public class Product {
    DecimalFormat decfor = new DecimalFormat("0.00");
    String name;
    double priceAtStart;
    int amountAtStart;

    public void printProduct() {
        System.out.println(name + ", " + decfor.format(priceAtStart) + ", " + amountAtStart);
    }

    public void changeAmount(int newAmount) {
        amountAtStart = newAmount;
    }

    public void changePrice(double newPrice) {
        priceAtStart = newPrice;
    }
}
