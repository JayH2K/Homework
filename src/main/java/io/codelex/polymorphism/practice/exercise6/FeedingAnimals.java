package io.codelex.polymorphism.practice.exercise6;

import java.util.*;

public class FeedingAnimals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        String input = "";
        while (!input.equals("End")) {
            input = in.nextLine();
            if (input.equals("End")) {
                break;
            }
            String[] inputArray = input.split(" ");
            switch (input.split(" ")[0]) {
                case "Zebra" -> {
                    animals.add(new Zebra(inputArray[1], Double.parseDouble(inputArray[2]), inputArray[3]));
                    animals.get(animals.size() - 1).makeSound();
                }
                case "Cat" -> {
                    animals.add(new Cat(inputArray[1], Double.parseDouble(inputArray[2]), inputArray[3], inputArray[4]));
                    animals.get(animals.size() - 1).makeSound();
                }
                case "Tiger" -> {
                    animals.add(new Tiger(inputArray[1], Double.parseDouble(inputArray[2]), inputArray[3]));
                    animals.get(animals.size() - 1).makeSound();
                }
                case "Mouse" -> {
                    animals.add(new Mouse(inputArray[1], Double.parseDouble(inputArray[2]), inputArray[3]));
                    animals.get(animals.size() - 1).makeSound();
                }
            }
            input = in.nextLine();
            inputArray = input.split(" ");
            switch (inputArray[0]) {
                case "Meat" -> {
                    animals.get(animals.size() - 1).eat(new Meat(Integer.parseInt(inputArray[1])));
                    System.out.println(animals.get(animals.size() - 1));
                }
                case "Vegetable" -> {
                    animals.get(animals.size() - 1).eat(new Vegetable(Integer.parseInt(inputArray[1])));
                    System.out.println(animals.get(animals.size() - 1));
                }
            }
        }
        System.out.println(animals);
    }
}
