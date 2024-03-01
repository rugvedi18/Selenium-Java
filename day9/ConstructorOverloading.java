package day9;

public class ConstructorOverloading {

    int x, y;
    double d;

    // 1
    ConstructorOverloading() {
        x = 10;
        y = 20;
    }

    // 2
    ConstructorOverloading(int a, int b) {
        x = a;
        y = b;
    }

    // 3
    ConstructorOverloading(int a, double b) {
        x = a;
        d = b;
    }

    // 4
    ConstructorOverloading(double b, int a) {
        x = a;
        d = b;
    }

    void Display() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(d);
    }

    public static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading();
        c1.Display();
    }
}
