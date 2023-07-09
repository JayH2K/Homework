package io.codelex.collections.practice.exercise4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ConsoleProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "placeholder";
        Set<String> names = new HashSet<>();
        while (!input.equals("")) {
            System.out.println("Enter name:");
            input = in.nextLine();
            if (!input.equals("")) {
                names.add(input);
            }
        }
        System.out.println("Unique name list contains: ");
        for (String i : names
        ) {
            System.out.print(" " + i);
        }
    }
}
