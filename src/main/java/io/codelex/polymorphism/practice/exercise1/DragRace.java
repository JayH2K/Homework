package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        Car audi = new Audi();
        cars.add(audi);
        Car bmw = new Bmw();
        cars.add(bmw);
        Car lexus = new Lexus();
        cars.add(lexus);
        Car tesla = new Tesla();
        cars.add(tesla);

        for (int i = 1; i <= 10; i++) {
            cars.forEach(Car::speedUp);
            if (i == 3) {
                for (Car car : cars
                ) {
                    if (car instanceof Boost) {
                        ((Boost) car).useNitrousOxideEngine();
                    }
                }
            }
        }
        cars.sort(Comparator.comparing(Car::showCurrentSpeed));
        System.out.println(cars.get(cars.size() - 1).getName() + " " + cars.get(cars.size() - 1).showCurrentSpeed());
    }
}
