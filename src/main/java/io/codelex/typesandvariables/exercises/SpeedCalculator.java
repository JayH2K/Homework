package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class SpeedCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input distance in meters");
        double userInputDist = scan.nextInt();
        System.out.println("Please input timer hours");
        int userInputHours = scan.nextInt();
        System.out.println("Please input timer minutes");
        int userInputMins = scan.nextInt();
        System.out.println("Please input timer seconds");
        int userInputSecs = scan.nextInt();
        double timeInSecs = userInputSecs + ((double) userInputMins * 60) + ((double) userInputHours * 3600);
        double speedMPS = userInputDist / timeInSecs;
        double speedKMH = speedMPS * 3.6;
        double speedMPH = speedKMH * 0.621371;
        System.out.println("Calculated speed:");
        System.out.println("m/s - " + speedMPS);
        System.out.println("km/h - " + speedKMH);
        System.out.println("mPh - " + speedMPH);
    }
}
