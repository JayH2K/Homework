package io.codelex.AdvancedJavaTest.Exercise5;

import java.util.List;
import java.util.function.Function;

public class Exercise5 {
    public static <T> double partOf(List<T> list, Function<T, Boolean> condition) {
        int count = 0;
        for (T element : list) {
            if (condition.apply(element)) {
                count++;
            }
        }
        double percentage = (double) count / list.size() * 100;
        return percentage;
    }

    public static void main(String[] args) {
        List<String> names = List.of("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, name -> name.length() > 4);
        System.out.println(percent);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, n -> n % 2 == 0);
        System.out.println(evenPercent);
    }
}