package io.codelex.oop.summary.exercise1;

import java.util.Random;

public class LazyBox {

    private RandomNumber number;

    public LazyBox() {
        this.number = null;
    }

    public double get() {
        if (number == null) {
            number = new RandomNumber();
        }
        return number.calculate();
    }

    private static class RandomNumber {
        double random;

        public double calculate() {
            if (random == 0) {
                random = Math.random() * (100 - 1 + 1) + 1;
            }
            return random;
        }
    }
}