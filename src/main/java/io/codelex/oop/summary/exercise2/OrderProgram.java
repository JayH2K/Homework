package io.codelex.oop.summary.exercise2;

public class OrderProgram {
    public static void main(String[] args) throws WrongOrderException, BadFoodException {
        SellableThing egg = new FoodItem("Egg", 2.99, "2033-12-10");
        SellableThing tv = new ElectronicsItem("TV", 999.69, 65);
        SellableThing lamp = new HouseholdItem("Lamp", 24.50, "Red");
        SellableThing itemPacking = new ItemPacking();

        Order orderA = new Order();
        orderA.addItem(egg);
        orderA.addItem(tv);
        orderA.addItem(lamp);
        orderA.addItem(itemPacking);

        Invoice invoiceA = new Invoice(orderA.getItems(), 1);
        System.out.println(invoiceA.getFormattedInvoice());
    }
}
