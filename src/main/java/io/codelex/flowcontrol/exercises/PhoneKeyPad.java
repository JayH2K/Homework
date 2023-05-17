package io.codelex.flowcontrol.exercises;

import java.util.Arrays;

import java.util.Objects;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.next().toLowerCase();
        String[] inputArray = input.split("", 0);


        for (int i = 0; inputArray.length >= i; ++i) {
            inputArray[i] = inputArray[i].toLowerCase();
            // if method:
            /*
            if (inputArray[i].matches("^[\\w.-]+$")) {
                if (Objects.equals(inputArray[i], "a") || Objects.equals(inputArray[i], "b") || Objects.equals(inputArray[i], "c")) {
                    System.out.println("2");
                } else if (Objects.equals(inputArray[i], "d") || Objects.equals(inputArray[i], "e") || Objects.equals(inputArray[i], "f")) {
                    System.out.println("3");
                } else if (Objects.equals(inputArray[i], "g") || Objects.equals(inputArray[i], "h") || Objects.equals(inputArray[i], "i")) {
                    System.out.println("4");
                } else if (Objects.equals(inputArray[i], "j") || Objects.equals(inputArray[i], "k") || Objects.equals(inputArray[i], "l")) {
                    System.out.println("5");
                } else if (Objects.equals(inputArray[i], "m") || Objects.equals(inputArray[i], "n") || Objects.equals(inputArray[i], "o")) {
                    System.out.println("6");
                } else if (Objects.equals(inputArray[i], "p") || Objects.equals(inputArray[i], "q") || Objects.equals(inputArray[i], "r") || Objects.equals(inputArray[i], "s")) {
                    System.out.println("7");
                } else if (Objects.equals(inputArray[i], "t") || Objects.equals(inputArray[i], "u") || Objects.equals(inputArray[i], "v")) {
                    System.out.println("8");
                } else if (Objects.equals(inputArray[i], "w") || Objects.equals(inputArray[i], "x") || Objects.equals(inputArray[i], "y") || Objects.equals(inputArray[i], "z")) {
                    System.out.println("9");
                }
            }

             */
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
