package io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person {

    String jobTitle;

    public Employee(String firstName, String lastName, String adress, int id, String job) {
        super(firstName, lastName, adress, id);
        this.jobTitle = job;
    }

    @Override
    public void display() {
        System.out.println(firstName + " " + lastName + ", ID:" + id + " - POSITION: " + jobTitle + " | " + adress);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String job) {
        this.jobTitle = job;
    }
}
