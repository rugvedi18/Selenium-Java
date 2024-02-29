package day9;

public class Greetings {
    // 1. No params, No return value
    void greeting1() {
        System.out.println("Hello, returning nothing");
    }

    // 2. No params, Returns value
    String greeting2() {
        return "Hello, returning a string";
    }

    // 3. Takes param, No return value
    void greeting3(String name) {
        System.out.println("Hello " + name + ", passing a parameter");
    }

    // 4. Takes param, Returns value
    String greeting4(String name) {
        return ("Hello " + name + ", passing param and returning a value");
    }
}
