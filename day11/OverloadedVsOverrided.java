package day11;

// parent class
class ABC {
    void m1(int a) {
        System.out.println(a);
    }

    void m2(int b) {
        System.out.println(b);
    }
}

// child class
class XYZ extends ABC {
    // overrided method
    void m1(int a) {
        System.out.println(a * a);
    }

    // overloaded method
    void m2(int a, int b) {
        System.out.println(b);
    }
}

public class OverloadedVsOverrided {
    public static void main(String[] args) {

        XYZ xyz = new XYZ();
        xyz.m1(100);
        xyz.m2(200);
        xyz.m2(10, 20);
    }
}
