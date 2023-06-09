package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    String animalName;
    String animalType;
    Double animalWeight;
    int foodEaten = 0;

    public abstract void makeSound();

    public abstract void eat(Food food);
}
