package io.codelex.dateandtime.practice.exercise3;

import java.time.LocalDate;

public class DatePeriodTest {
    public static void main(String[] args) {
        LocalDate startA = LocalDate.of(2000, 1, 1);
        LocalDate endA = LocalDate.of(2001, 12, 31);
        LocalDate startB = LocalDate.of(1999, 6, 1);
        LocalDate endB = LocalDate.of(2000, 6, 1);

        DatePeriod A = new DatePeriod(startA, endA);
        DatePeriod B = new DatePeriod(startB, endB);

        System.out.println(A.intersection(B));
    }

}
