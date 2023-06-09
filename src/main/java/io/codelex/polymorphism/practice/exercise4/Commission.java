package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {

    double salesTotal;
    double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double sales) {
        this.salesTotal += sales;
    }

    public void addHours(int hours) {
        super.addHours(hours);
    }

    public double pay() {
        this.salesTotal = 0;
        return super.pay() + (super.pay() * (commissionRate / 10));
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal sales: " + salesTotal;
    }
}
