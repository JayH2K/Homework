package io.codelex.oop.shapes2;

public class Rectangle extends Shape {
    int height;
    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int calculatePerimeter() {
        return (this.height * 2) + (this.width * 2);
    }

    @Override
    public int calculateArea() {
        return (this.width * this.height);
    }
}
