package io.codelex.oop.summary.exercise2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<SellableThing> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(SellableThing item) throws BadFoodException {
        items.add(item);
        if (item instanceof FoodItem) {
            if (LocalDate.parse(((FoodItem) item).getBestBefore()).isBefore(ChronoLocalDate.from(LocalDateTime.now()))) {
                throw new BadFoodException("Food best-before date is before current date");
            }
        }
    }

    public String getOrderItems() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            SellableThing item = items.get(i);
            sb.append((i + 1) + ". " + item.fullInfo() + "\n");
        }
        return sb.toString();
    }

    public List<SellableThing> getItems() {
        return items;
    }
}
