package io.codelex.classesandobjects.exercise9;

public class SwapPointsTest {
    public static void main(String[] args) {
        Point point1 = new Point(2, 4);
        Point point2 = new Point(1, 5);
        Point.swapPoints(point1, point2);
        System.out.println("(" + point1.x + ", " + point1.y + ")");
        System.out.println("(" + point2.x + ", " + point2.y + ")");
    }
}
