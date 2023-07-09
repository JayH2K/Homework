package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> list = new ArrayList<>();
        //TODO: Add 10 values to list
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");
        System.out.println("List:\n" + list);
        //TODO: Add new value at 5th position
        list.add(4, "K");
        System.out.println("List after adding K to 5th position:\n" + list);

        //TODO: Change value at last position (Calculate last position programmatically)
        list.set(list.size() - 1, "L");
        System.out.println("List after changing last value:\n" + list);

        //TODO: Sort your list in alphabetical order
        Collections.sort(list);
        System.out.println("List after sorting alphabetically:\n" + list);

        //TODO: Check if your list contains "Foobar" element
        if (list.contains("Foobar")) {
            System.out.println("List contains foobar");
        } else {
            System.out.println("List does not contain foobar");
        }

        //TODO: Print each element of list using loop
        System.out.println("List elements:");
        for (String i : list
        ) {
            System.out.println(i);
        }

    }

}
