package io.codelex.dateandtime.practice.exercise1;

import java.time.*;

public class WorkHoursCalculator {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2023, 1, 1);
        LocalDate date2 = LocalDate.of(2023, 12, 31);
        int hoursWorked = 0;

        for (LocalDate date = date1; date.isBefore(date2); date = date.plusDays(1)) {
            if (!date.getDayOfWeek().equals(DayOfWeek.SUNDAY) &&
                    !date.getDayOfWeek().equals(DayOfWeek.SATURDAY) &&
                    !date.equals(LocalDate.of(2023, 1, 1)) &&
                    !date.equals(LocalDate.of(2023, 4, 7)) &&
                    !date.equals(LocalDate.of(2023, 4, 9)) &&
                    !date.equals(LocalDate.of(2023, 4, 10)) &&
                    !date.equals(LocalDate.of(2023, 5, 1)) &&
                    !date.equals(LocalDate.of(2023, 5, 4)) &&
                    !date.equals(LocalDate.of(2023, 5, 5)) &&
                    !date.equals(LocalDate.of(2023, 5, 14)) &&
                    !date.equals(LocalDate.of(2023, 5, 28)) &&
                    !date.equals(LocalDate.of(2023, 6, 23)) &&
                    !date.equals(LocalDate.of(2023, 6, 24)) &&
                    !date.equals(LocalDate.of(2023, 7, 9)) &&
                    !date.equals(LocalDate.of(2023, 7, 10)) &&
                    !date.equals(LocalDate.of(2023, 11, 18)) &&
                    !date.equals(LocalDate.of(2023, 11, 20)) &&
                    !date.equals(LocalDate.of(2023, 12, 24)) &&
                    !date.equals(LocalDate.of(2023, 12, 25)) &&
                    !date.equals(LocalDate.of(2023, 12, 26)) &&
                    !date.equals(LocalDate.of(2023, 12, 31))) {
                hoursWorked += 8;
            }
        }
        System.out.println(hoursWorked);
    }
}
