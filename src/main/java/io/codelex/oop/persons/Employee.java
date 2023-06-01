package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {

    String position;
    LocalDate startedWork;

    public Employee(String position, LocalDate startedWork, String firstName, String lastName, String ID, int age) {
        super(firstName, lastName, ID, age);
        this.position = position;
        this.startedWork = startedWork;
    }

    public int getWorkXP(LocalDate startedWork) {
        Period worked = startedWork.until(LocalDate.now());
        return worked.getYears();
    }

    @Override
    public String getInfo() {
        return firstName + " " + lastName + ". Pos: " + position + ". (" + getWorkXP(this.startedWork) + " years)";
    }
}
