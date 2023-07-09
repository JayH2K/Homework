package io.codelex.oop.shapes2;

public class Qube extends Shape3D {
    int edge;

    public Qube(int edge) {
        this.edge = edge;
    }

    @Override
    public int calculatePerimeter() {
        return edge * 12;
    }

    @Override
    public int calculateArea() {
        return (int) (Math.pow(edge, 2) * 6);
    }

    @Override
    public int calculateVolume() {
        return (int) Math.pow(edge, 3);
    }
}

