package io.codelex.arithmetic.exercises;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your weight in kg");
        double weightKg = scan.nextInt()*2.205;
        System.out.println("Please input your height in cm");
        double heightIn = scan.nextInt()*0.393701;
        double BMI = weightKg * 703 / (heightIn*heightIn);
        System.out.println("Your BMI is: " + BMI);

        if (BMI>25) {
            System.out.println("Unfortunately, you are a bit overweight...");
        } else if (BMI<18.5) {
            System.out.println("Unfortunately, you are a bit underweight...");
        } else {
            System.out.println("Congratulations, you are within a healthy BMI range for your height and weight! ");
        }
    }
}
