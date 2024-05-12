package day13;

import day13.package1.Test2; // when you have to access class from another package, you have to use import

public class TestMain {
    public static void main(String[] args) {
        Test1 t = new Test1();

        // t.m1(); // error: m1() has private access in Test1
        // System.out.println(t.a); // error: a has private access in Test1

        t.m2(); // Output: This is m2 default method
        // if this file is created in another package say package1
        // error: m2() is not public in Test1; cannot be accessed from outside package
        System.out.println(t.b); // Output: 200
        // error: b is not public in Test1; cannot be accessed from outside package

        t.m3(); // Output: This is m3 protected method
        // if this file is created in another package say package1
        // error: m3() has protected access in Test1
        System.out.println(t.c); // Output: 300
        // error: c has protected access in Test1

        t.m4(); // Output: This is m4 public method
        System.out.println(t.d); // Output: 400
    }
}

/*
 * public class TestMain extends Test2 {
 * public static void main(String[] args) {
 * // In Java, protected members of a class are accessible from a subclass only
 * // through inheritance, and access to these members should be done through an
 * // object of the subclass itself, not by creating an instance of the
 * superclass
 * // directly in the subclass.
 * TestMain t2 = new TestMain(); // for protected method case
 * 
 * // access protected method from package1
 * // TestMain extends Test2
 * // TestMain t2 = new TestMain();
 * t2.z1();
 * System.out.println(t2.z);
 * }
 * }
 */