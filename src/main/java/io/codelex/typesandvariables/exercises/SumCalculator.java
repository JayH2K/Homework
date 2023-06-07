package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 6 numbers into the terminal");
        int intOne = scan.nextInt();
        int intTwo = scan.nextInt();
        int intThree = scan.nextInt();
        int intFour = scan.nextInt();
        int intFive = scan.nextInt();
        int intSix = scan.nextInt();
        int sum = (intOne + intTwo + intThree + intFour + intFive + intSix);
        System.out.println("The sum of all inputs is " + sum);
    }
}
