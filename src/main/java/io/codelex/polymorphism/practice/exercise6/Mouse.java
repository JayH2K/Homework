package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Mouse extends Mammal {
    DecimalFormat format = new DecimalFormat("00.0");

    public Mouse(String name, double weight, String region) {
        super.animalType = "Mouse";
        super.animalWeight = weight;
        super.region = region;
        super.animalName = name;
    }

    @Override
    public void makeSound() {
        System.out.println("squeek!");
    }

    @Override
    public void eat(Food food) {
        foodEaten += food.quantity;
    }

    @Override
    public String toString() {
        return "Mouse[" +
                animalName + ", " +
                format.format(animalWeight) + ", " +
                region + ", " +
                foodEaten + "]";
    }
}
