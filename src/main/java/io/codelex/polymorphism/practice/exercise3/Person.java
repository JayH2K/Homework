package io.codelex.polymorphism.practice.exercise3;

public class Person {
    String firstName;
    String lastName;
    String adress;
    int id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(String firstName, String lastName, String adress, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.id = id;
    }

    public void display() {
        System.out.println(firstName + " " + lastName + ", ID:" + id + " | " + adress);
    }
}
