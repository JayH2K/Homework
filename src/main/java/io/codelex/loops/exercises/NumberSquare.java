package io.codelex.loops.exercises;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input two numbers. Min first, then max:");
        int min = scan.nextInt();
        int max = scan.nextInt();
        int num = min;
        int lineCounter = 0;
        for (int i = (max - min) + 1; i > 0; i--) {
            num = min + lineCounter;
            for (int j = min; j <= max; j++) {
                System.out.print(num);
                if (num < max) {
                    num++;
                } else {
                    num = min;
                }
            }
            System.out.print("\n");
            lineCounter++;
        }
    }
}
