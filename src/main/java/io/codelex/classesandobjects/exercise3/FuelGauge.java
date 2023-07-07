package io.codelex.classesandobjects.exercise3;

public class FuelGauge {

    double fuelL;

    public FuelGauge(double fuelL) {

        this.fuelL = fuelL;
    }

    public double getFuel() {

        return fuelL;
    }

    public double refuel() {
        if (fuelL < 70) {
            return ++fuelL;
        } else {
            return fuelL;
        }
    }

    public double spendFuel() {
        return --fuelL;
    }
}
