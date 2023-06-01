package io.codelex.oop.shapes;

import java.text.DecimalFormat;

public class ShapesTest {
    public static void main(String[] args) {
        DecimalFormat dec = new DecimalFormat("0.00");


        Shape shapeA = new Rectangle(4, 10, 10);
        Shape shapeB = new Triangle(3, 10, 10);

        System.out.println("Rectangle area: " + shapeA.getArea() + ". Rectangle perimeter: " + shapeA.getPerimiter());
        System.out.println("Triangle area: " + shapeB.getArea() + ". Triangle perimeter: " + dec.format(shapeB.getPerimiter()));
    }
}
