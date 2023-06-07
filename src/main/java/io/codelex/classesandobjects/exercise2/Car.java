package io.codelex.classesandobjects.exercise2;

public class Car {
    double startKilometers;
    double currentKilometers;
    double tankL;

    public Car(double startOdo) {
        this.startKilometers = startOdo;
    }

    void fillUp(int mileage, double liters) {
        this.currentKilometers = mileage;
        this.tankL = tankL + liters;

    }

    public double calculateConsumption() {
        return (tankL * 100) / (currentKilometers - startKilometers);
    }

    public boolean gasHog() {
        return calculateConsumption() > 15;
    }

    public boolean economyCar() {
        return calculateConsumption() < 5;
    }
}
