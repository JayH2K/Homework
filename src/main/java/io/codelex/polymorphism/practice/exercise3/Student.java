package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person {

    double GPA;

    public Student(String firstName, String lastName, String adress, int id, double gpa) {
        super(firstName, lastName, adress, id);
        this.GPA = gpa;
    }

    @Override
    public void display() {
        System.out.println(firstName + " " + lastName + ", ID:" + id + " - GPA: " + GPA + " | " + adress);
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
