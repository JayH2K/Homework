package io.codelex.oop.summary.exercise1;

import io.codelex.oop.summary.generics.Printer;
import io.codelex.oop.summary.generics.StorageHouse;

import java.time.LocalDate;

public class LazyBoxTest {
    public static void main(String[] args) {
        LazyBox box = new LazyBox();

        double a = box.get();
        double b = box.get();

        System.out.println(a + " / " + b);

        var storage = new StorageHouse<>("X");
        storage.addMoreItems("Y");
        System.out.println(storage);
    }
}
