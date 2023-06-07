package io.codelex.dateandtime.practice.exercise2;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.time.*;

public class ServerUpdate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input launch date (yyyy-MM-dd):");
        String input = in.nextLine();
        System.out.println("Please input month to check (yyyy-MM):");
        String input2 = in.nextLine();

        LocalDate launchDate = LocalDate.parse(input);
        YearMonth inputDate = YearMonth.parse(input2);
        int firstWeekday = launchDate.getDayOfWeek().getValue();
        int weeksPassed = 1;
        boolean firstOut = false;
        for (LocalDate date = launchDate; date.isBefore(inputDate.atEndOfMonth()); date = date.plusDays(1)) {
            if (date.getDayOfWeek().getValue() == firstWeekday) {
                if (weeksPassed < 2) {
                    weeksPassed++;
                } else {
                    weeksPassed = 1;
                }
                if (date.getMonth().equals(inputDate.getMonth())) {
                    if (weeksPassed == 2) {
                        if (!firstOut) {
                            System.out.println("Setver will need to be updated on: ");
                            firstOut = true;
                        }
                        System.out.println(date);
                    }
                }
            }
        }
    }
}
