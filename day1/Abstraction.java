package day1;

// Abstraction - hiding the implementation details and showing only the necessary features of an object

public class Abstraction {
	public static void main(String[] args) {
		// Creating an object of the Dog class
		Animal myDog = new Dog();
		myDog.makeSound();
		myDog.eat();
	}
}

// Abstract class
abstract class Animal {
	// Abstract method (does not have a body)
	public abstract void makeSound();

	// Regular method
	public void eat() {
		System.out.println("This animal is eating");
	}
}

// Subclass (inherits from Animal)
class Dog extends Animal {
	public void makeSound() {
		System.out.println("Dog makes sound");
	}
}