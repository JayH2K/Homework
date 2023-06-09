package io.codelex.polymorphism.practice.exercise1;

public class Tesla implements Car {
    private final String name = "Tesla";

    private Integer currentSpeed = 0;

    public String getName() {
        return name;
    }

    public void speedUp() {
        currentSpeed += 20;
    }

    public void slowDown() {
        currentSpeed += 20;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("-- silence ---");
    }
}
