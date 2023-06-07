package io.codelex.oop.cars;

import java.time.LocalDate;
import java.util.Objects;

public class Manufacturer {
    String name;
    LocalDate yearEstablished;
    String country;

    public Manufacturer(String name, LocalDate yearEstablished, String country) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.country = country;
    }

    @Override
    public String toString() {
        return name + " (" + country + ')';
    }

    public String getName() {
        return name;
    }

    public LocalDate getYearEstablished() {
        return yearEstablished;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return Objects.equals(name, that.name) && Objects.equals(yearEstablished, that.yearEstablished) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearEstablished, country);
    }
}
