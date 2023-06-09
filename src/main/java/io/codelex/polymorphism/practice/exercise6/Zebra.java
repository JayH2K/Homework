package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Zebra extends Mammal {
    DecimalFormat format = new DecimalFormat("00.0");

    public Zebra(String name, double weight, String region) {
        super.animalType = "Zebra";
        super.animalWeight = weight;
        super.region = region;
        super.animalName = name;
    }

    @Override
    public void makeSound() {
        System.out.println("*zebra noises*");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            foodEaten += food.quantity;
        } else {
            System.out.println("Zebras don't eat meat!");
        }
    }

    @Override
    public String toString() {
        return "Zebra[" +
                animalName + ", " +
                format.format(animalWeight) + ", " +
                region + ", " +
                foodEaten + "]";
    }
}
