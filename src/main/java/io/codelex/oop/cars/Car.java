package io.codelex.oop.cars;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Car {
    String name;
    String model;
    double price;
    LocalDate yearManufactured;
    Manufacturer mainManufacturer;

    List<Manufacturer> partsManufacturers;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(yearManufactured, car.yearManufactured) && Objects.equals(mainManufacturer, car.mainManufacturer) && Objects.equals(partsManufacturers, car.partsManufacturers) && engine == car.engine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearManufactured, engine);
    }

    @Override
    public String toString() {
        return name + ' ' + model +
                ". Price: $" + price +
                ". Manufacturing year - " + yearManufactured.getYear() +
                ". Manufacturer - " + mainManufacturer +
                ". Engine - " + engine + " | ";
    }

    public Car(String name, String model, double price, LocalDate yearManufactured, Manufacturer mainManufacturer, List<Manufacturer> partsManufacturers, Engines engine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearManufactured = yearManufactured;
        this.mainManufacturer = mainManufacturer;
        this.partsManufacturers = partsManufacturers;
        this.engine = engine;
    }

    Engines engine;

    public void setPrice(double price) {
        this.price = price;
    }


}
