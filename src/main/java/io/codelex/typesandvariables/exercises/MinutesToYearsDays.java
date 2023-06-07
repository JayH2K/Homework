package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class MinutesToYearsDays {
    public static void main(String[] args) {
        System.out.println("Please input number of minutes");
        Scanner scan = new Scanner(System.in);
        int userInputMin = scan.nextInt();
        double inputToDays = 0.000694444 * userInputMin;
        double inputToYears = (double) userInputMin / 525600;
        System.out.println(userInputMin + "is equal to " + inputToDays + " day/s,");
        System.out.println("And " + inputToYears + " year/s!");
    }
}
