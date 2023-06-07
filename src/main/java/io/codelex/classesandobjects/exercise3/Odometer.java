package io.codelex.classesandobjects.exercise3;


public class Odometer {

    int drivenKM;

    public Odometer(int startKM) {

        this.drivenKM = startKM;
    }

    public double getDrivenKM() {

        return drivenKM;
    }

    public double drive1KM() {
        return ++drivenKM;
    }

}
