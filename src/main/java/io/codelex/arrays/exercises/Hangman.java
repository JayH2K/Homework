package io.codelex.arrays.exercises;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static org.apache.commons.lang3.ArrayUtils.indexOf;

public class Hangman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = {"talisman",
                "monkey",
                "cannonball",
                "tumbleweed",
                "reality",
                "summoning",
                "gambling",
                "ambidextrous",
                "military",
                "pandemonium",
                "colony"};
        double wordCurrent = Math.floor(Math.random() * words.length + 1);
        String[] blankArray = words[(int) wordCurrent].split("", 0);
        Arrays.fill(blankArray, "_");
        String[] wordArray = words[(int) wordCurrent].split("", 0);
        String[] missArray = {"", "", "", "", "", "", ""};
        int missCount = 0;
        while (!Arrays.toString(wordArray).equals(Arrays.toString(blankArray))) {
            for (int i = 0; i < wordArray.length; i++) {
                boolean goodGuess = false;
                for (String j : blankArray
                ) {
                    System.out.print(j + " ");
                }
                System.out.println("\n Guess:");
                String guess = scan.next();
                if (guess.length() == 1) {
                    for (i = 0; i < wordArray.length; ++i) {
                        if (Objects.equals(wordArray[i], guess)) {
                            blankArray[i] = guess;
                            goodGuess = true;
                        }
                        if (i == wordArray.length - 1 && !goodGuess) {
                            System.out.println("Ouch, that's a miss, " + (6 - missCount) + " misses left");
                            System.out.print("\n Misses: ");
                            missArray[missCount] = guess;
                            for (String j : missArray
                            ) {
                                System.out.print(j + " ");
                            }
                            System.out.print("\n");
                            ++missCount;
                        }
                    }
                }
                if (missCount == 7) {
                    System.out.println("Aaand that's a loss, sorry...");
                    System.exit(0);
                }
            }
        }
        if (Arrays.toString(wordArray).equals(Arrays.toString(blankArray))) {
            for (String j : blankArray
            ) {
                System.out.print(j + " ");
            }
            System.out.println("\n Congratulations, you won!");
            System.exit(0);
        }
    }
}