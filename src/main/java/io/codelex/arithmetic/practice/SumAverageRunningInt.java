package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        int lowerBound = 1;
        int upperBound = 100;
        int average = (lowerBound + upperBound) / 2;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }
        System.out.println("The sum of " + lowerBound + " to " + upperBound + " equals " + sum);
        System.out.println("The average is " + average);
    }
}
