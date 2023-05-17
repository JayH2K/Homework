package io.codelex.loops.exercises;

import java.util.Scanner;

public class TwoWordsAndDots {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first word:");
        String word1 = scan.next();
        System.out.println("Input second word:");
        String word2 = scan.next();
        int dotCount = 30 - (word2.length() + word2.length());
        String dotString = ".".repeat(dotCount);
        System.out.println(word1 + dotString + word2);
    }
}
