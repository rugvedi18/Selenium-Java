package day1;

// Encapsulation - restricting direct access to an object's data and only allowing manipulation through getters and setters.
// (Data hiding, security)

public class Encapsulation {

	public static void main(String[] args) {
		// Creating an instance of person
		Person person = new Person();

		// Setting values using setter methods
		person.setName("John Doe");
		person.setAge(25);

		// Getting values using getter methods
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
	}
}

class Person {
	// Private fields to restrict direct access
	private String name;
	private int age;

	// Public getter method for 'name'
	public String getName() {
		return name;
	}

	// Public setter method for 'name'
	public void setName(String name) {
		this.name = name;
	}

	// Public getter method for 'age'
	public int getAge() {
		return age;
	}

	// Public setter method for 'age'
	public void setAge(int age) {
		this.age = age;
	}

}
