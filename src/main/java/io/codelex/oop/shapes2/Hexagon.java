package io.codelex.oop.shapes2;

public class Hexagon extends Shape {

    int sideLength;

    @Override
    public int calculatePerimeter() {
        return sideLength * 6;
    }

    public Hexagon(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int calculateArea() {
        return (int) ((3 * Math.sqrt(3) *
                (sideLength * sideLength)) / 2);
    }
}
