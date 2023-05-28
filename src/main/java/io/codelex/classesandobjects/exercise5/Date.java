package io.codelex.classesandobjects.exercise5;

import java.text.DecimalFormat;

public class Date {
    DecimalFormat format = new DecimalFormat("00");
    private int year;
    private int month;

    private int day = 11;

    public Date(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.println(format.format(getDay()) + "/" + format.format(getMonth()) + "/" + getYear());
    }
}
