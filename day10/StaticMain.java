package day10;

public class StaticMain {
    public static void main(String[] args) {

        // To use static variable a and static method m2 of StaticExample class we need
        // to write StaticExample.a and StaticExample.m1()
        System.out.println(StaticExample.a);
        StaticExample se = new StaticExample();
        System.out.println(se.b);

        StaticExample.m1();
        se.m2();

        se.m();
    }
}
