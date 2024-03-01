package day9;

public class ConstructorDemo {

    int x, y;
    String s;

    // Default constructor
    // ConstructorDemo() {
    // x = 100;
    // y = 200;
    // s = "Default Constructor";
    // }

    // Parameterized constructor
    ConstructorDemo(int a, int b, String str) {
        x = a;
        y = b;
        s = str;
    }

    void DisplayData() {
        System.out.println(x + " " + y + " " + s);
    }

    public static void main(String[] args) {
        // Invoking Default cconstructor
        // ConstructorDemo d1 = new ConstructorDemo();
        // d1.DisplayData();

        // Invoking Parameterized Constructor
        ConstructorDemo d1 = new ConstructorDemo(10, 20, "Hellow");
        d1.DisplayData();
    }
}
