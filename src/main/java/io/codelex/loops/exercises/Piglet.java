package io.codelex.loops.exercises;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        System.out.println("Hello, let's play Piglet! Ready to roll? Just say yes!");
        String input = scan.next();
        if (input.equals("yes")) {
            for (int i = 1; i > 0; ) {
                Random rand = new Random();
                int num = rand.nextInt((10)) + 1;
                if (num > 1) {
                    System.out.println("You rolled " + num + "! Roll again?");
                    score += num;
                } else {
                    score = 0;
                    System.out.println("Off, that's a " + num + "... score is " + score + " Roll again?");
                }
                input = scan.next();
                if (input.equals("no")) {
                    System.out.println("Your score is - " + score);
                    i = -1;
                } else {
                    i++;
                }
            }
        }
    }
}
