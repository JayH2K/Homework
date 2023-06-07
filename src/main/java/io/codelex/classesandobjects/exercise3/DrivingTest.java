package io.codelex.classesandobjects.exercise3;

import java.util.Scanner;

public class DrivingTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int iter = 0;

        Odometer odo = new Odometer(0);
        FuelGauge fuel = new FuelGauge(0);

        while (fuel.getFuel() == 0) {

            System.out.println("You currently have " + fuel.getFuel() + "l of fuel. How many litres would you like to refuel?");

            int input = scan.nextInt();
            for (int i = 0; i < input; i++) {
                fuel.refuel();
            }
        }
        while (fuel.getFuel() != 0) {
            if (iter < 10) {
                odo.drive1KM();
                ++iter;
                System.out.println("KM driven: " + odo.getDrivenKM());
                System.out.println("Fuel: " + fuel.getFuel() + "l");
            } else {
                iter = 0;
                fuel.spendFuel();
                System.out.println("KM driven: " + odo.getDrivenKM());
                System.out.println("Fuel: " + fuel.getFuel() + "l");

            }
        }
    }
}
