package io.codelex.oop.cars;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class CarService {
    List<Car> carList;

    public CarService(List<Car> carList) {
        this.carList = carList;
    }

    public void add(Car... car) {
        this.carList.addAll(List.of(car));
    }


    public String listAll() {
        String list = "";
        for (Car i : this.carList
        ) {
            list = list.concat(i.toString() + "\n");
        }
        return list;
    }

    public void remove(Car car) {
        this.carList.removeIf(i -> i.equals(car));
    }

    public String getV8() {
        String result = "";
        for (Car i : this.carList
        ) {
            if (i.engine.equals(Engines.V8)) {
                result = result.concat(i + "\n");
            }
        }
        return result;
    }

    public Car getCheapest() {
        Car result = null;
        for (Car a : this.carList
        ) {
            boolean cheapest = true;
            for (int i = 0; i < carList.size(); i++) {
                if (a.price > carList.get(i).price) {
                    cheapest = false;
                }
            }
            if (cheapest) {
                result = a;
            }
        }
        return result;
    }

    public Car getMostExpensive() {
        Car result = null;
        for (Car a : carList
        ) {
            boolean mostExpensive = true;
            for (int i = 0; i < carList.size(); i++) {
                if (a.price < carList.get(i).price) {
                    mostExpensive = false;
                }
            }
            if (mostExpensive) {
                result = a;
            }
        }
        return result;
    }

    public String getProdBefore(LocalDate date) {
        String result = "";
        for (Car i : this.carList
        ) {
            if (i.yearManufactured.isBefore(date)) {
                result = result.concat(i + "\n");
            }
        }
        return result;
    }

    public String get3PlusPartsManufacturers() {
        String result = "";
        for (Car i : this.carList
        ) {
            if (i.partsManufacturers.size() >= 3) {
                result = result.concat(i + "\n");
            }
        }
        return result;
    }

    public String getByManufacturer(String manufacturer) {
        String result = "";
        for (Car i : this.carList
        ) {
            if (i.mainManufacturer.name.equals(manufacturer)) {
                result = result.concat(i + "\n");
            }
        }
        return result;
    }

    public String checkIfInList(String model) {
        String result = "";
        for (Car i : this.carList
        ) {
            if (i.model.equals(model)) {
                result = "The " + i.model + " is on the list!";
            }
        }
        if (result.equals("")) {
            result = "The " + model + " is not on the list!";
        }
        return result;
    }

    public String getByManufacturerYearEstablishedBefore(LocalDate date) {
        String result = "";
        for (Car i : this.carList
        ) {
            if (i.mainManufacturer.yearEstablished.isBefore(date)) {
                result = result.concat(i + "\n");
            }
        }
        return result;
    }

    public String getByManufacturerYearEstablishedAfter(LocalDate date) {
        String result = "";
        for (Car i : this.carList
        ) {
            if (i.mainManufacturer.yearEstablished.isAfter(date)) {
                result = result.concat(i + "\n");
            }
        }
        return result;
    }

    public void sortByNameAscending() {
        this.carList.sort(new SortByPriceAscending());
    }

    public void sortByNameDescending() {
        this.carList.sort(new SortByNameDescending());
    }

    public void sortByPriceAscending() {
        this.carList.sort(new SortByNameAscending());
    }

    public void sortByPriceDescending() {
        this.carList.sort(new SortByPriceDescending());
    }

    public void sortByYearAscending() {
        this.carList.sort(new SortByYearAscending());
    }

    public void sortByYearDescending() {
        this.carList.sort(new SortByYearDescending());
    }

    public static class SortByNameAscending implements Comparator<Car> {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    public static class SortByNameDescending implements Comparator<Car> {
        @Override
        public int compare(Car o1, Car o2) {
            return o2.name.compareTo(o1.name);
        }
    }

    public static class SortByPriceAscending implements Comparator<Car> {
        @Override
        public int compare(Car o1, Car o2) {
            return (int) (o1.price - o2.price);
        }
    }

    public static class SortByPriceDescending implements Comparator<Car> {
        @Override
        public int compare(Car o1, Car o2) {
            return (int) (o2.price - o1.price);
        }
    }

    public static class SortByYearAscending implements Comparator<Car> {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.yearManufactured.compareTo(o2.yearManufactured);
        }
    }

    public static class SortByYearDescending implements Comparator<Car> {
        @Override
        public int compare(Car o1, Car o2) {
            return o2.yearManufactured.compareTo(o1.yearManufactured);
        }
    }

}
