package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class UpperCaseCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput = scan.next();
        int upperCasers = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upperCasers++;
            }
        }
        System.out.println("Th number of upper case characters in your sentence is " + upperCasers);
    }
}//Pagaidām neizdevās atrast, kā atrisināt inputus ar atstarpēm...
