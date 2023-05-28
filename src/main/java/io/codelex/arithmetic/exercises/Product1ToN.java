package io.codelex.arithmetic.exercises;

public class Product1ToN {
    public static void main(String[] args) {
        int baseInt = 10;
        int factorialInt = 1;
        for (int i = factorialInt; i <= baseInt; ++i) {
            factorialInt = factorialInt * i;
        }
        System.out.println("The factorial of said number is " + factorialInt);
    }
}
