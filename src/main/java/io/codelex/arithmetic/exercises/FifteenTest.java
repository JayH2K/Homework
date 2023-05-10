package io.codelex.arithmetic.exercises;
import java.util.Scanner;
import java.lang.*;
public class FifteenTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a number");
        int inputOne = scan.nextInt();
        System.out.println("Please input a second number");
        int inputTwo = scan.nextInt();
        int inputSum = inputOne+inputTwo;
        int inputDif = inputOne-inputTwo;
        if ((inputOne == 15) || (inputTwo == 15) || (inputSum == 15) || (inputDif == 15)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
