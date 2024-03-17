package day12;

// Final Keyword on method - we cannot oveeride the method
// Final Keyword on class - we cannot inherit/extend the class

// final class Test1 {
class Test1 {
    // final void m() {
    void m() {
        System.out.println("This class Test1");
    }
}

// error - The type Test2 cannot subclass the final class
class Test2 extends Test1 {
    // error - cannot oveeride the final method from Test1
    void m() {
        System.out.println("This class Test2");
    }
}

public class FinalMethod {

}
