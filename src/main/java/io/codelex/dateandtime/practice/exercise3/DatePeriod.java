package io.codelex.dateandtime.practice.exercise3;

import java.time.*;

public class DatePeriod {

    LocalDate start;
    LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    private boolean overlaps(DatePeriod period) {
        boolean ret = false;
        for (LocalDate date = this.start; date.isBefore(period.end); date = date.plusDays(1)) {
            if (date.isEqual(period.start) || date.isEqual(period.end)) {
                ret = true;
            }
        }
        return ret;
    }

    private boolean encompasses(DatePeriod period) {
        if (this.start.isBefore(period.start) || this.end.isAfter(period.end)) {
            return true;
        } else {
            return false;
        }
    }

    public DatePeriod intersection(DatePeriod period) {
        LocalDate start = null;
        LocalDate end = null;
        if (this.overlaps(period)) {
            return null;
        } else if (this.encompasses(period)) {
            start = period.start;
            end = period.end;
        } else {
            for (LocalDate date = this.start; date.isBefore(period.end); date = date.plusDays(1)) {
                if (date.isEqual(period.start)) {
                    start = date;
                }
                if (date.isEqual(period.end)) {
                    end = date;
                }
            }
        }
        return new DatePeriod(start, end);
    }

    @Override
    public String toString() {
        return "Period: " +
                "from " + start +
                " to " + end;
    }
}
