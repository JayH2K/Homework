package io.codelex.arithmetic.practice;

import java.text.DecimalFormat;

public class GravityCalculator {
    public static void main(String[] arguments) {
        DecimalFormat df = new DecimalFormat("#.##");
        double gravity = -9.81;  // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition;
        System.out.println("The object's position after " + df.format(fallingTime) + " seconds is " + df.format(finalPosition) + " m.");
    }
}
