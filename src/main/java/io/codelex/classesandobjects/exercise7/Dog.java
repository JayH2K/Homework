package io.codelex.classesandobjects.exercise7;

public class Dog {

    String name;

    String sex;

    Dog father;
    Dog mother;

    public Dog(String name, String sex) {
        this.sex = sex;
        this.name = name;
    }

    public void assingParents(Dog mother, Dog father) {
        this.father = father;
        this.mother = mother;
    }

    public String fathersName() {

        if (this.father != null) {
            return this.father.name;
        } else {
            return "Unknown";
        }

    }

    public String toString() {
        return "name: " + name + " Sex: " + sex;
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        return this.mother == otherDog.mother;
    }

}
