package io.codelex.oop.shapes2;

public class Cone extends Shape3D {
    int height;
    int width;

    @Override
    public int calculatePerimeter() {
        double hypotenuse = (Math.sqrt(Math.pow(this.height, 2) + Math.pow((double) this.width / 2, 2)));
        return (int) (this.width + (hypotenuse * 2));
    }

    public Cone(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int calculateArea() {
        int radius = this.width / 2;
        return (int) ((Math.PI) * (radius) * (radius + Math.sqrt((Math.pow(this.height, 2)) + (Math.pow(radius, 2)))));
    }

    @Override
    public int calculateVolume() {
        int radius = this.width / 2;
        return (int) (Math.PI * (radius * radius) * this.height / 3);
    }
}
