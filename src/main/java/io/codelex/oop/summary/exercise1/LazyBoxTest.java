package io.codelex.oop.summary.exercise1;

public class LazyBoxTest {
    public static void main(String[] args) {
        LazyBox box = new LazyBox();

        double a = box.get();
        double b = box.get();

        System.out.println(a + " / " + b);
    }
}
