package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer {

    String battery;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(battery, laptop.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    @Override
    public String toString() {
        return "Laptop: " +
                "CPU: " + cpu + " | " +
                "RAM: " + ram + " | " +
                "GPU: " + gpu + " | " +
                "Battery " + battery + " | " +
                "Brand name: " + brand + " | " +
                "Model: " + model + " |";
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public Laptop(String cpu, String ram, String gpu, String brand, String model, String battery) {
        super(cpu, ram, gpu, brand, model);
        this.battery = battery;
    }
}
