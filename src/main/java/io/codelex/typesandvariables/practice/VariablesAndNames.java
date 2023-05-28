package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;

public class VariablesAndNames {
    private static final DecimalFormat decimalFormator = new DecimalFormat("0.00");

    public static void main(String[] args) {
        int cars, seatsInACar, drivers, passengers, carsNotDriven, carsDriven;
        double carpoolCapacity, averagePassengersPerCar;

        cars = 100;
        seatsInACar = 4;
        drivers = 30;
        passengers = 90;
        carsNotDriven = cars - drivers; // free cars
        carsDriven = drivers; // cars driven at the moment
        carpoolCapacity = carsDriven * seatsInACar;
        averagePassengersPerCar = passengers / carsDriven;

        System.out.println("There are " + decimalFormator.format(cars) + " cars available.");
        System.out.println("There are only " + decimalFormator.format(drivers) + " drivers available.");
        System.out.println("There will be " + decimalFormator.format(carsNotDriven) + " empty cars today.");
        System.out.println("We can transport " + decimalFormator.format(carpoolCapacity) + " people today.");
        System.out.println("We have " + decimalFormator.format(passengers) + " to carpool today.");
        System.out.println("We need to put about " + decimalFormator.format(averagePassengersPerCar) + " in each car.");
    }
}