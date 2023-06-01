package io.codelex.oop.computers;

import java.util.ArrayList;
import java.util.List;

public class ComputersTest {
    public static void main(String[] args) {
        List<Computer> inventory = new ArrayList<>(0);
        inventory.add(new Computer("i3-9100f", "16GB DDR4", "GTX 1650 Super", "Capital", "Xenon X"));
        inventory.add(new Laptop("i5-10100", "8GB DDR4", "intel UHD620(integrated)", "Lenovo", "IdeaPad5", "DGTEC L19D3PF3"));
        System.out.println(inventory.get(0));
        System.out.println(inventory.get(1));
    }
}
