package io.codelex.arithmetic.exercises;
import java.util.Scanner;

public class TooHightTooLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretNum = (int)Math.floor(Math.random() * (100 - 1 + 1) + 1);
        System.out.println("I'm thinking of a number from 1-100, try to guess it!");
        System.out.println("Hint: it's " + secretNum);
        int inputOne = scan.nextInt();
        if (inputOne == secretNum) {
            System.out.println("Nice, lucky guess! it was " + secretNum + "!");
        } else if (inputOne>secretNum){
            System.out.println("Nop, that's too high.");
        } else {
            System.out.println("Nop, that's too low.");
        }
    }
}
