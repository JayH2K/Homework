package io.codelex.oop.shapes;

public class Rectangle extends Shape {
    int height;
    int width;

    public Rectangle(int numSides, int height, int width) {
        super(numSides);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {

        return (double) (this.height * this.width) / 2;
    }

    @Override
    public double getPerimiter() {
        return (this.height * 2) + (this.width * 2);
    }
}
