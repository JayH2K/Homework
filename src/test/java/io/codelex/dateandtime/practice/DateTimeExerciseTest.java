package io.codelex.dateandtime.practice;

import io.codelex.enums.examples.Day;
import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.Month.JANUARY;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeExerciseTest {

    @Test
    public void shouldCreateNewDate() {
        LocalDate newYearsEve = LocalDate.of(2017, 12, 31);
        assertThat(newYearsEve.getYear(), is(equalTo(2017)));
        assertThat(newYearsEve.getMonth(), is(equalTo(Month.DECEMBER)));
        assertThat(newYearsEve.getDayOfMonth(), is(equalTo(31)));
    }

    @Test
    public void shouldGotoFirstOfNextMonth() {
        LocalDate newYearsEve = DateTimeExercise.createNewYearsEve2017();
        LocalDate firstJanuary2018 = newYearsEve.plusDays(1);
        assertThat(firstJanuary2018.getYear(), is(equalTo(2018)));
        assertThat(firstJanuary2018.getMonth(), is(equalTo(Month.JANUARY)));
        assertThat(firstJanuary2018.getDayOfMonth(), is(equalTo(1)));
    }

    @Test
    public void shouldRetrieveDateInformationUsingChronoFields() {
        LocalDate newYearsEve = DateTimeExercise.createNewYearsEve2017();
        int year = newYearsEve.get(ChronoField.YEAR); // replace this by getting the year using chrono fields interface
        int month = newYearsEve.get(ChronoField.MONTH_OF_YEAR);
        int day = newYearsEve.get(ChronoField.DAY_OF_MONTH);
        assertThat(year, is(equalTo(newYearsEve.getYear())));
        assertThat(month, is(equalTo(12)));
        assertThat(day, is(equalTo(newYearsEve.getDayOfMonth())));
    }

    @Test
    public void shouldParseLocalDate() {
        String newYearsEveAsString = DateTimeExercise.createNewYearsEve2017().toString();
        LocalDate newYearsEve = LocalDate.parse(newYearsEveAsString); // parse the string to a date
        assertThat(newYearsEve.getYear(), is(equalTo(2017)));
        assertThat(newYearsEve.getMonth(), is(equalTo(Month.DECEMBER)));
        assertThat(newYearsEve.getDayOfMonth(), is(equalTo(31)));
    }

    @Test
    public void shouldThrowParseException() {
        Exception exception = assertThrows(DateTimeParseException.class, () -> {
            String newYearsEveAsString = DateTimeExercise.createNewYearsEve2017().toString() + "isgagdfyi";
            try {
                LocalDate newYearsEve = LocalDate.parse(newYearsEveAsString);
            } catch (DateTimeParseException e) {
                throw e;
            }
        });
    }

    @Test
    public void shouldParseLocalTime() {
        String midnightAsString = "00:00";
        LocalTime midnight = LocalTime.parse(midnightAsString);
        assertThat(midnight.getHour(), is(equalTo(0)));
        assertThat(midnight.getMinute(), is(equalTo(0)));
        assertThat(midnight.getSecond(), is(equalTo(0)));
    }

    @Test
    public void shouldCreateLocalDateTimeNewYearsEve() {
        LocalDateTime newYearsEve = DateTimeExercise.createNewYearsEve2017().atTime(LocalTime.MIDNIGHT);
        assertThat(newYearsEve.getYear(), is(equalTo(2017)));
        assertThat(newYearsEve.getMonth(), is(equalTo(Month.DECEMBER)));
        assertThat(newYearsEve.getDayOfMonth(), is(equalTo(31)));
        assertThat(newYearsEve.getHour(), is(equalTo(0)));
        assertThat(newYearsEve.getMinute(), is(equalTo(0)));
        assertThat(newYearsEve.getSecond(), is(equalTo(0)));
    }

    @Test
    public void shouldCreateNewYearsInstant() {
        Instant newYearsEveInstant = Instant.ofEpochSecond(1514678400); // use https://www.epochconverter.com/ to create the instance
        assertNotNull(newYearsEveInstant);
    }

    @Test
    public void shouldCalculateDaysBetween() {
        LocalDate[] dates = DateTimeExercise.getTwoLocalDates();
        long daysBetween = Period.between(dates[0], dates[1]).getDays(); // calculate days between dates[0] and dates[1]
        assertThat(DateTimeExercise.DAYS_BETWEEN, equalTo(daysBetween));
    }

    @Test
    public void shouldCreateDurationFromTemporalUnit() {
        Duration duration = Duration.between(LocalTime.of(0, 0, 0), LocalTime.of(0, 0, 5)); // create a duration of 5 seconds
        long seconds = duration.getSeconds();
        assertThat(5L, equalTo(seconds));
    }

    @Test
    public void shouldCheckIfDurationIsZero() {
        Duration duration = Duration.between(LocalDateTime.of(1, 1, 1, 0, 0, 0), LocalDateTime.of(1, 1, 6, 0, 0, 0)); // create a duration of 5 days
        boolean isZero = duration.isZero(); // check for the duration if it's zero
        assertThat(false, equalTo(isZero));
    }

    @Test
    public void shouldFormatToString() {
        LocalDate newYearsEve = DateTimeExercise.createNewYearsEve2017();
        String format = newYearsEve.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")); // format the string
        assertThat("2017-12-31", equalTo(format));
    }

    @Test
    public void shouldUseWithMethodtoChangeDate() {
        LocalDate newYearsEve = DateTimeExercise.createNewYearsEve2017();
        LocalDate newYearsEve2018 = newYearsEve.with(Year.of(2018)); // change the newYearsEve using the with method
        LocalDate firstJanuary = newYearsEve2018.with(TemporalAdjusters.firstDayOfNextMonth());
        assertThat(2018, equalTo(newYearsEve2018.getYear()));
        assertThat(1, equalTo(firstJanuary.getDayOfMonth()));
    }

    @Test
    public void shouldAdjustToNewYearsEve() {
        LocalDate firstOfDecember = LocalDate.of(2017, 12, 1);
        LocalDate newYearsEve = firstOfDecember.with(TemporalAdjusters.lastDayOfMonth()); // write a temporal adjuster to ajust the firstOfDecember to new years eve
        assertThat(newYearsEve.getYear(), is(equalTo(2017)));
        assertThat(newYearsEve.getMonth(), is(equalTo(Month.DECEMBER)));
        assertThat(newYearsEve.getDayOfMonth(), is(equalTo(31)));
    }

    @Test
    public void shouldFindTheNextFriday13th() {
        LocalDate from = LocalDate.of(2017, JANUARY, 1);
        LocalDate expected = LocalDate.of(2017, JANUARY, 13);
        assertEquals(expected, DateTimeExercise.findNextFriday13th(from));
    }
}