package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results

        ArrayList<String> array2 = new ArrayList<>(0);
        array2.addAll(Arrays.asList(array));
        System.out.println(array2);

        //todo - replace array with a HashSet and print out the results
        Set<String> set = new HashSet<>();
        set.add(array[0]);
        set.add(array[1]);
        set.add(array[2]);
        set.add(array[3]);
        set.add(array[4]);
        set.add(array[5]);
        set.add(array[6]);
        System.out.println(set);


        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        HashMap<String, String> carManufacturers = new HashMap<>();
        carManufacturers.put(array[0], "Germany");
        carManufacturers.put(array[1], "Germany");
        carManufacturers.put(array[3], "Japan");
        carManufacturers.put(array[4], "Germany");
        carManufacturers.put(array[5], "Germany");
        carManufacturers.put(array[6], "USA");
        System.out.println(carManufacturers);
    }
}
