package io.codelex.oop.persons;

public class Customer extends Person {

    String customerID;
    int puchaseCount;

    public void setPuchaseCount(int puchaseCount) {
        this.puchaseCount = puchaseCount;
    }

    public int getPuchaseCount() {
        return puchaseCount;
    }

    public Customer(String customerID, int puchaseCount, String firstName, String lastName, String ID, int age) {
        super(firstName, lastName, ID, age);
        this.customerID = customerID;
        this.puchaseCount = puchaseCount;
    }

    @Override
    public String getInfo() {
        return firstName + " " + lastName + " ID:" + customerID + " | purchase count: " + puchaseCount;
    }
}
