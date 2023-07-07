package io.codelex.classesandobjects.exercise5;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(1952, 8, 14);

        date.displayDate();

        date.setDay(20);
        date.setYear(1969);
        date.setMonth(4);

        date.displayDate();
    }
}
