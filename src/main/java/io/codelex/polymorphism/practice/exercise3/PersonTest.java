package io.codelex.polymorphism.practice.exercise3;

public class PersonTest {
    public static void main(String[] args) {
        Person jesseP = new Student("Jesse", "Pinkman", "9809 Margo Street, Albuquerque, NM", 1028365, 1.3);
        Person walterW = new Employee("Walter", "White", "3828 Piermont Dr, Albuquerque, NM", 1094327, "Chemestry Teacher");
        jesseP.display();
        walterW.display();
    }
}
