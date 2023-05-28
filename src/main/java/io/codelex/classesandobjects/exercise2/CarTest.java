package io.codelex.classesandobjects.exercise2;

import java.util.Scanner;

class CarTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean onTrip = true;

        System.out.print("Enter first odometer reading for the car: ");
        double startKilometers = scan.nextDouble();

        Car car = new Car(startKilometers);

        System.out.println("After driving for a while, you stop to refuel!");

        while (onTrip) {
            System.out.print("Input current odometer reading: ");
            int odoRead = scan.nextInt();
            System.out.print("How many litres of fuel was used: ");
            double fillUp = scan.nextDouble();
            car.fillUp(odoRead, fillUp);
            System.out.println("Average fuel consumption: " + car.calculateConsumption() + "l/100km");
            System.out.println("Continue trip? Y/N:");
            String input = scan.next();
            if (input.equals("N")) {
                onTrip = false;
            } else {
                System.out.println("After driving for a while, you stop to refuel.");
            }
        }
        if (car.gasHog()) {
            System.out.println("Your car is a gas hog");
        } else if (car.economyCar()) {
            System.out.println("Your car is an economy car");
        }
    }
}
