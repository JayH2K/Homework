package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Tiger extends Feline {
    DecimalFormat format = new DecimalFormat("00.0");

    public Tiger(String name, double weight, String region) {
        super.animalName = name;
        super.animalType = "Tiger";
        super.animalWeight = weight;
        super.region = region;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            foodEaten += food.quantity;
        } else {
            System.out.println("Tigers don't eat veggies!");
        }
    }

    @Override
    public String toString() {
        return "Tiger[" +
                animalName + ", " +
                format.format(animalWeight) + ", " +
                region + ", " +
                foodEaten + "]";
    }
}
