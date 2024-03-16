package day11;

// covered single and multi level inheritance

// Parent or Super or Base
class A {
    int a;

    void display() {
        System.out.println(a);
    }
}

// Child or Sub or Derived
class B extends A {
    int b;

    void show() {
        System.out.println(b);
    }
}

class C extends B {
    int c;

    void print() {
        System.out.println(c);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {

        // B bobj = new B();

        // bobj.a = 100;
        // bobj.b = 200;

        // bobj.display();
        // bobj.show();

        C cobj = new C();

        cobj.a = 10;
        cobj.b = 20;
        cobj.c = 30;

        cobj.display();
        cobj.show();
        cobj.print();

    }
}