package io.codelex.collections.practice.phonebook;

import java.util.*;

public class PhoneDirectory {
    private final Map<String, List<Integer>> data;

    public PhoneDirectory() {
        data = new TreeMap<>();
    }

    public String getNumber(String name) {
        String numbers = "";
        if (data.containsKey(name)) {
            for (Integer i : data.get(name)
            ) {
                numbers = numbers.concat(i.toString() + " | ");
            }
            return name + ": " + numbers;
        }
        return "unavailable";
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        if (data.containsKey(name)) {
            data.get(name).add(Integer.parseInt(number));
        } else {
            data.put(name, new ArrayList<>());
            data.get(name).add(Integer.parseInt(number));
        }
    }

}
