package io.codelex.oop.shapes2;

public class Shapes2Test {
    public static void main(String[] args) {
        Shape triangle = new Triangle(10, 15);
        Shape rectangle = new Rectangle(20, 20);
        Shape hexagon = new Hexagon(10);
        Shape3D cone = new Cone(20, 10);
        Shape3D cube = new Qube(10);

        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Hexagon area: " + hexagon.calculateArea());
        System.out.println("Hexagon perimeter: " + hexagon.calculatePerimeter());
        System.out.println("Cone perimeter: " + cone.calculatePerimeter());
        System.out.println("Cone area: " + cone.calculateArea());
        System.out.println("Cone volume: " + cone.calculateVolume());
        System.out.println("Cube perimeter: " + cube.calculatePerimeter());
        System.out.println("Cube area: " + cube.calculateArea());
        System.out.println("Cube volume: " + cube.calculateVolume());

    }
}
