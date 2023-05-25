package io.codelex.classesandobjects.exercise1;

public class ProductApp {
    public static void main(String[] args) {
        Product mouseLogitech = new Product();
        Product phoneIphone5s = new Product();
        Product projectorEpsonU05 = new Product();

        mouseLogitech.name = "Logitech Mouse";
        phoneIphone5s.name = "iPhone 5s";
        projectorEpsonU05.name = "Epson EB-U05";

        mouseLogitech.amountAtStart = 13;
        phoneIphone5s.amountAtStart = 3;
        projectorEpsonU05.amountAtStart = 1;

        mouseLogitech.priceAtStart = 70.00;
        phoneIphone5s.priceAtStart = 999.99;
        projectorEpsonU05.priceAtStart = 440.46;

        mouseLogitech.printProduct();
        phoneIphone5s.printProduct();
        projectorEpsonU05.printProduct();

        phoneIphone5s.changeAmount(15);
        projectorEpsonU05.changePrice(499.99);

        System.out.println("Updated data:");
        phoneIphone5s.printProduct();
        projectorEpsonU05.printProduct();
    }
}
