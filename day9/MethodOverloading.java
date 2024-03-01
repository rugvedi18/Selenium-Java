package day9;

public class MethodOverloading {

    int x, y, z;
    double d;

    // 1
    void sum() {
        x = 10;
        y = 20;
        System.out.println(x + y);
    }

    // 2
    void sum(int a, int b) {
        x = a;
        y = b;
        System.out.println(x + y);
    }

    // 3
    void sum(int a, double b) {
        x = a;
        d = b;
        System.out.println(x + d);
    }

    // 4
    void sum(double b, int a) {
        x = a;
        d = b;
        System.out.println(x + d);
    }

    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        m1.sum(); // 1
        m1.sum(100, 200); // 2 int, int
        m1.sum(10.5, 10); // 4 decimal, int
        m1.sum(20, 20.5); // 3 int, decimal
    }
}
