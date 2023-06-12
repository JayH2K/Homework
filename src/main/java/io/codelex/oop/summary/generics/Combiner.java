package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class Combiner<T> {

    //Fix this method so it can receive two any kind of objects
    //Test the functionality

    public String combineTwoItems(T first, T second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }
}
