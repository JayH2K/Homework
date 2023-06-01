package io.codelex.oop.shapes2;

public class Triangle extends Shape {

    int height;
    int width;

    @Override
    public int calculatePerimeter() {
        double hypotenuse = (Math.sqrt(Math.pow(this.height, 2) + Math.pow((double) this.width / 2, 2)));
        return (int) (this.width + (hypotenuse * 2));
    }

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int calculateArea() {
        return (this.height * this.width) / 2;
    }
}
