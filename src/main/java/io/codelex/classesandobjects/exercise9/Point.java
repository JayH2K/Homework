package io.codelex.classesandobjects.exercise9;

public class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void swapPoints(Point p1, Point p2) {
        int xTemp = p1.x;
        int yTemp = p1.y;
        p1.x = p2.x;
        p1.y = p2.y;
        p2.x = xTemp;
        p2.y = yTemp;
    }
}
