package io.codelex.flowcontrol.exercises;

import java.util.Arrays;

import java.util.Objects;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.next().toLowerCase();
        String[] inputArray = input.split("", 0);


        for (int i = 0; inputArray.length > i; ++i) {
            inputArray[i] = inputArray[i].toLowerCase();
            // if method:

            if (inputArray[i].matches("^[\\w.-]+$")) {
                if (inputArray[i].equals("a") || inputArray[i].equals("b") || inputArray[i].equals("c")) {
                    System.out.println("2");
                } else if (inputArray[i].equals("d") || inputArray[i].equals("e") || inputArray[i].equals("f")) {
                    System.out.println("3");
                } else if (inputArray[i].equals("g") || inputArray[i].equals("h") || inputArray[i].equals("i")) {
                    System.out.println("4");
                } else if (inputArray[i].equals("j") || inputArray[i].equals("k") || inputArray[i].equals("l")) {
                    System.out.println("5");
                } else if (inputArray[i].equals("m") || inputArray[i].equals("n") || inputArray[i].equals("o")) {
                    System.out.println("6");
                } else if (inputArray[i].equals("p") || inputArray[i].equals("q") || inputArray[i].equals("r") || inputArray[i].equals("s")) {
                    System.out.println("7");
                } else if (inputArray[i].equals("t") || inputArray[i].equals("u") || inputArray[i].equals("v")) {
                    System.out.println("8");
                } else if (inputArray[i].equals("w") || inputArray[i].equals("x") || inputArray[i].equals("y") || inputArray[i].equals("z")) {
                    System.out.println("9");
                }
            }


            // switch method:
            /*
            switch (inputArray[i]) {
                case "a", "b", "c" -> System.out.println(2);
                case "d", "e", "f" -> System.out.println(3);
                case "g", "h", "i" -> System.out.println(4);
                case "j", "k", "l" -> System.out.println(5);
                case "m", "n", "o" -> System.out.println(6);
                case "p", "q", "r", "s" -> System.out.println(7);
                case "t", "u", "v" -> System.out.println(8);
                case "w", "x", "y", "z" -> System.out.println(9);
            }

             */
        }
    }
}
