package io.codelex.classesandobjects.exercise7;

public class DogTest {
    public static void main(String[] args) {

        Dog Max = new Dog("Max", "male");
        Dog Rocky = new Dog("Rocky", "male");
        Dog Sparky = new Dog("Sparky", "male");
        Dog Buster = new Dog("Buster", "male");
        Dog Sam = new Dog("Sam", "male");
        Dog Lady = new Dog("Lady", "female");
        Dog Molly = new Dog("Molly", "female");
        Dog Coco = new Dog("Coco", "female");

        Max.assingParents(Lady, Rocky);
        Coco.assingParents(Molly, Buster);
        Rocky.assingParents(Molly, Sam);
        Buster.assingParents(Lady, Sparky);

        System.out.println("Coco's fathers name is " + Coco.fathersName());
        System.out.println("Sparkiy's fathers name is " + Sparky.fathersName());
        if (Coco.hasSameMotherAs(Rocky)) {
            System.out.println("Coco has the same mother as Sparky");
        }
    }
}
