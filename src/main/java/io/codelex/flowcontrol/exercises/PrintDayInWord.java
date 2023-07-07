package io.codelex.flowcontrol.exercises;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        /*
        //Šis bija, kā uzrakstīju pirms izlasīju tos divus papildus nosacījumus zem Exercise #4
        Scanner reader = new Scanner(System.in);
        String[] days = {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println("Please input a weekday as a number:");
        int num = reader.nextInt();
        System.out.println("That's " + days[num-1]);
         */

        //Šādi panācu rezultātu ar switch
        Scanner reader = new Scanner(System.in);
        System.out.println("Please input a weekday as a number:");
        int num = reader.nextInt();
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid number");

        }
    }
}
