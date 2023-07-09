package io.codelex.oop.persons;

import java.time.LocalDate;

public class GroceryStore {
    public static void main(String[] args) {
        Person employeeJJ = new Employee("Cashier", LocalDate.of(2019, 4, 9), "Jonah", "Jameson", "182790-09677", 44);
        Person employeeCJ = new Employee("Cashier", LocalDate.of(2021, 9, 15), "Carl", "Johnson", "250394-02347", 23);
        Person employeeDT = new Employee("Inventory manager", LocalDate.of(2022, 12, 23), "Dominic", "Toretto", "210384-28374", 31);

        Person customerA = new Customer("MM1098563429587", 189, "Marty", "McFly", "234456-28575", 77);
        Person customerB = new Customer("TS1325835890053", 79, "Tony", "Stark", "395648-10042", 46);

        System.out.println("Current employees:");
        System.out.println(employeeJJ.getInfo());
        System.out.println(employeeCJ.getInfo());
        System.out.println(employeeDT.getInfo());

        System.out.println("Current registered customers:");
        System.out.println(customerA.getInfo());
        System.out.println(customerB.getInfo());

    }
}
