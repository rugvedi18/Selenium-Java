
// we cannot create an object of an interface so we have to create child class of this interface
interface Shape {
    int length = 10; // by default final & static
    int width = 20; // by default final & static

    void circle(); // abstract method - only has definition and no implementation

    /*
     * this will give error as interface consider it as abstract methods and
     * abstract methods does not contain implementation
     * void square()
     * {
     * 
     * }
     */

    // methods in interface are public

    default void square() // have to use default keyword - default method cannot be public
    {
        System.out.println("This is square - default method");
    }

    static void rectangle() // have to use static keyword
    {
        System.out.println("This is rectangle - static method");
    }
}

// Shape - parent, InheritanceDemo - child class
public class InheritanceDemo implements Shape {

    // In the class all methods are bydefault default
    // void circle() cannot reduce the visibility of the inhereted method from Shape
    // we have to implement abstract method here
    public void circle() {
        System.out.println("This is circle");
    }

    public static void main(String[] args) {
        InheritanceDemo idobj = new InheritanceDemo();

        idobj.circle();
        idobj.square();
        Shape.rectangle(); // rectangle is a static method, we can access it directly

        // we cannot create an object of interface
        // Shape sh = new Shape(); // incorrect

        // but you can use class name which implements shape
        // interface varibale can hold the object of implemented class of interface
        Shape sh = new InheritanceDemo();
        sh.circle();
        sh.square();
        Shape.rectangle();
    }
}

// we can create Object reference for Interface but we cannot instantiate
// interface