package io.codelex.oop.persons;

public abstract class Person {
    String firstName;
    String lastName;
    String ID;
    int age;

    public Person(String firstName, String lastName, String ID, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public abstract String getInfo();
}
