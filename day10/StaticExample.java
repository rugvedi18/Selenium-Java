package day10;

public class StaticExample {

    static int a = 10; // static variable
    int b = 20; // non-static variable

    // static method
    static void m1() {
        System.out.println("This is m1 static method");
    }

    // non-static method
    void m2() {
        System.out.println("This is m2 non static method");
    }

    // non static method into method
    void m() {
        System.out.println(a); // static
        System.out.println(b); // non-static
        m1(); // static
        m2(); // non-static
    }

    // Main method moved into StaticMain.java

    /*
     * public static void main(String[] args) {
     * // Static methods can access static stuff directly without creating an object
     * System.out.println(a);
     * // An error will appear - Cannot make a static ref to the non-static field
     * // System.out.println(b);
     * StaticExample se = new StaticExample();
     * System.out.println(se.b);
     * 
     * m1();
     * // An error will appear - Cannot make a static ref to the non-static method
     * // m2();
     * se.m2();
     * 
     * se.m();
     * 
     * }
     */
}
