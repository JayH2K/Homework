package io.codelex.arithmetic.exercises;
import java.util.Scanner;
public class CheckOddEven {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Please input a number");
        int num = reader.nextInt();
        if(num % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
