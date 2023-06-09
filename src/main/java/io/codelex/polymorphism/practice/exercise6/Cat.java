package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Cat extends Feline {
    DecimalFormat format = new DecimalFormat("00.0");

    public Cat(String name, double weight, String region, String breed) {
        super.animalName = name;
        super.animalWeight = weight;
        super.region = region;
        super.breed = breed;
        super.animalType = "Cat";
    }

    @Override
    public void makeSound() {
        System.out.println("*meow*");
    }

    @Override
    public String toString() {
        return "Cat[" +
                animalName + ", " +
                breed + ", " +
                format.format(animalWeight) + ", " +
                region + ", " +
                foodEaten + "]";
    }

    @Override
    public void eat(Food food) {
        foodEaten += food.quantity;
    }
}
