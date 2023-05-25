package io.codelex.loops.exercises;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Please input a number:");
        int input = scanInput.nextInt();
        int outputCounter = 0;
        for (int i = 1; i < input; i++) {
            outputCounter++;
            if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else {
                System.out.print(i + " ");
            }
            if (outputCounter == 20) {
                System.out.println("");
                outputCounter -= 20;
            }
        }
    }
}
