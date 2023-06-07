package io.codelex.typesandvariables.practice;
import java.text.DecimalFormat;
public class MoreVariablesAndPrinting {
    private static final DecimalFormat decimalFormator = new DecimalFormat("0.00");
    public static void main(String[] args) {
        String Name, Eyes, Teeth, Hair;
        int Age;
        double  Height, Weight;

        Name = "Zed A. Shaw";
        Age = 35;
        Height = 74*2.54;  // inches
        Weight = 180*0.453592; // lbs
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";

        System.out.println("Let's talk about " + Name + ".");
        System.out.println("He's " + decimalFormator.format(Height) + " inches tall.");
        System.out.println("He's " + decimalFormator.format(Weight) + " pounds heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair.");
        System.out.println("His teeth are usually " + Teeth + " depending on the coffee.");

        System.out.println("If I add " + decimalFormator.format(Age) + ", " + decimalFormator.format(Height) + ", and " + decimalFormator.format(Weight)
                + " I get " + decimalFormator.format((Age + Height + Weight)) + ".");
    }
}