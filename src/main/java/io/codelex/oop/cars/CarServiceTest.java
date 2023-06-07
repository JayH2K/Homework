package io.codelex.oop.cars;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class CarServiceTest {
    public static void main(String[] args) {
        //Car manufacturers
        Manufacturer nissan = new Manufacturer("Nissan", LocalDate.of(1933, 12, 26), "Japan");
        Manufacturer toyota = new Manufacturer("Toyota", LocalDate.of(1937, 8, 28), "Japan");
        Manufacturer ford = new Manufacturer("Ford", LocalDate.of(1903, 6, 16), "U.S.");
        Manufacturer chevrolet = new Manufacturer("Chevrolet", LocalDate.of(1911, 11, 3), "U.S.");
        Manufacturer audi = new Manufacturer("Audi", LocalDate.of(1909, 7, 16), "Germany");
        //Parts manufacturers
        Manufacturer bbs = new Manufacturer("BBS", LocalDate.of(1970, 1, 1), "Germany");
        Manufacturer hks = new Manufacturer("HKS", LocalDate.of(1973, 1, 1), "Japan");
        Manufacturer ffr = new Manufacturer("Factory Five Racing", LocalDate.of(1995, 1, 1), "USA");
        Manufacturer greddy = new Manufacturer("Greddy", LocalDate.of(1977, 1, 1), "Japan");
        //Cars
        Car nissan240SX = new Car("Nissan S", "240SX", 19000, LocalDate.of(1995, 7, 17), nissan, new ArrayList<>(), Engines.I4);
        Car corollaAE86 = new Car("Toyota Corolla", "AE86", 24000, LocalDate.of(1985, 8, 3), toyota, new ArrayList<>(), Engines.I4);
        Car shelbyCobraGT350 = new Car("Shelby Mustang", "Cobra GT350", 57000, LocalDate.of(1967, 9, 26), ford, new ArrayList<>(), Engines.V8);
        Car corvetteC4 = new Car("Chevrolet Corvette", "C4", 15000, LocalDate.of(1993, 3, 3), chevrolet, new ArrayList<>(), Engines.V8);
        Car quattroB2 = new Car("Audi Quattro", "B2", 11000, LocalDate.of(1987, 12, 1), audi, new ArrayList<>(), Engines.V8);
        List<Car> carList = new ArrayList<>();

        CarService LosSantosCustoms = new CarService(carList);

        LosSantosCustoms.add(nissan240SX, corollaAE86, shelbyCobraGT350, corvetteC4, quattroB2);

        //Assigning car part manufacturers
        LosSantosCustoms.carList.get(carList.indexOf(nissan240SX)).partsManufacturers.add(hks);
        LosSantosCustoms.carList.get(carList.indexOf(nissan240SX)).partsManufacturers.add(bbs);
        LosSantosCustoms.carList.get(carList.indexOf(nissan240SX)).partsManufacturers.add(ffr);

        LosSantosCustoms.carList.get(carList.indexOf(shelbyCobraGT350)).partsManufacturers.add(ffr);
        LosSantosCustoms.carList.get(carList.indexOf(shelbyCobraGT350)).partsManufacturers.add(bbs);

        LosSantosCustoms.carList.get(carList.indexOf(quattroB2)).partsManufacturers.add(bbs);
        LosSantosCustoms.carList.get(carList.indexOf(quattroB2)).partsManufacturers.add(ffr);
        LosSantosCustoms.carList.get(carList.indexOf(quattroB2)).partsManufacturers.add(greddy);
        LosSantosCustoms.carList.get(carList.indexOf(quattroB2)).partsManufacturers.add(hks);


        System.out.println("Current car list:");
        System.out.println(LosSantosCustoms.listAll());
        System.out.println("**removing AE86**");
        LosSantosCustoms.remove(corollaAE86);
        System.out.println(LosSantosCustoms.listAll());
        System.out.println("Cheapest car: " + LosSantosCustoms.getCheapest());
        System.out.println("Most expensive car: " + LosSantosCustoms.getMostExpensive());
        System.out.println("Cars produced before 1990:");
        System.out.println(LosSantosCustoms.getProdBefore(LocalDate.of(1990, 1, 1)));
        System.out.println("Cars with 3+ parts manufacturers:");
        System.out.println(LosSantosCustoms.get3PlusPartsManufacturers());
        System.out.println("Cars sorted by price ascending:");
        LosSantosCustoms.sortByPriceAscending();
        System.out.println(LosSantosCustoms.listAll());
        System.out.println("Cars sorted by price descending:");
        LosSantosCustoms.sortByPriceDescending();
        System.out.println(LosSantosCustoms.listAll());
        System.out.println("Cars sorted by year ascending:");
        LosSantosCustoms.sortByYearAscending();
        System.out.println(LosSantosCustoms.listAll());
        System.out.println("Cars sorted by year descending:");
        LosSantosCustoms.sortByYearDescending();
        System.out.println(LosSantosCustoms.listAll());
        System.out.println("Cars sorted by name ascending:");
        LosSantosCustoms.sortByNameAscending();
        System.out.println(LosSantosCustoms.listAll());
        System.out.println("Cars sorted by name descending:");
        LosSantosCustoms.sortByNameDescending();
        System.out.println(LosSantosCustoms.listAll());
        System.out.println("All Audis in list:");
        System.out.println(LosSantosCustoms.getByManufacturer("Audi"));
        System.out.println("Is the 240SX in the list?");
        System.out.println(LosSantosCustoms.checkIfInList("240SX"));
        System.out.println("Is the AE86 in the list?");
        System.out.println(LosSantosCustoms.checkIfInList("AE86"));
        System.out.println("Cars with the manufacturer established before 1930:");
        System.out.println(LosSantosCustoms.getByManufacturerYearEstablishedBefore(LocalDate.of(1930, 1, 1)));
        System.out.println("Cars with the manufacturer established after 1930:");
        System.out.println(LosSantosCustoms.getByManufacturerYearEstablishedAfter(LocalDate.of(1930, 1, 1)));

        //Okay, I think I got it by now, I already don't have enough time...  :D
    }
}
