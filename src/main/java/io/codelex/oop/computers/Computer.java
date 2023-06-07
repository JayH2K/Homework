package io.codelex.oop.computers;

import java.util.Objects;

public class Computer {
    String cpu;
    String ram;
    String gpu;
    String brand;
    String model;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(cpu, computer.cpu) && Objects.equals(ram, computer.ram) && Objects.equals(gpu, computer.gpu) && Objects.equals(brand, computer.brand) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, gpu, brand, model);
    }

    @Override
    public String toString() {
        return "PC: " +
                "CPU: " + cpu + " | " +
                "RAM: " + ram + " | " +
                "GPU: " + gpu + " | " +
                "Brand name: " + brand + " | " +
                "Model: " + model + " |";
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Computer(String cpu, String ram, String gpu, String brand, String model) {
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.brand = brand;
        this.model = model;
    }
}
