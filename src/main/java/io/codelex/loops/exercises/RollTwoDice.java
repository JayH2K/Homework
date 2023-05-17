package io.codelex.loops.exercises;

import java.util.Scanner;
import java.util.Random;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Please input a desired sum:");
        int input = scan.nextInt();
        int sum = 0;
        while (sum != input) {
            int dice1 = rand.nextInt((6 - 1) + 1) + 1;
            int dice2 = rand.nextInt((6 - 1) + 1) + 1;
            System.out.print(dice1 + " and " + dice2 + " = ");
            sum = dice1 + dice2;
            System.out.println(sum);
        }
    }
}
