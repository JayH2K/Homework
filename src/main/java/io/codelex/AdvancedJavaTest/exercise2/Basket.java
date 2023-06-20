package io.codelex.AdvancedJavaTest.exercise2;

import io.codelex.AdvancedJavaTest.BasketEmptyException;
import io.codelex.AdvancedJavaTest.BasketFullException;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    List<T> basket = new ArrayList<>();

    public void addToBasket(T item) throws BasketFullException {
        if (basket.size() == 10) {
            throw new BasketFullException("The basket is full!");
        }
        basket.add(item);
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (basket.size() == 0) {
            throw new BasketEmptyException("The basket is empty!");
        }
        basket.remove(basket.size() - 1);
    }
}
