package io.codelex.polymorphism.practice.exercise1;

import java.util.Optional;

public interface Car {
    String getName();

    void speedUp();

    void slowDown();

    String showCurrentSpeed();

    default void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

}
