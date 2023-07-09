package io.codelex.oop.shapes;

public class Triangle extends Shape {
    int height;
    int width;

    public Triangle(int numSides, int height, int width) {
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
        double hypotenuse = (Math.sqrt(Math.pow(this.height, 2) + Math.pow((double) this.width / 2, 2)));
        return this.width + (hypotenuse * 2);
    }
}
