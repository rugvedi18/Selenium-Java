package day11;

public class SuperAnimal {
    String color = "white";

    void eat() {
        System.out.println("eating");
    }
}

class Dog extends SuperAnimal {
    String color = "black";

    void eat() {
        System.out.println("eating bread");
    }

    void displayColor() {
        System.out.println(color); // child color
        // super keyword invoked immediate parent class variable
        System.out.println(super.color); // parent color
    }
}
