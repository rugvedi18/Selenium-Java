package day12;

public class MainClass implements Interface1, Interface2 {
    public void m1() {
        System.out.println("This is m1 from Interface1");
        System.out.println(x);
    }

    public void m2() {
        System.out.println("This is m2 from Interface2");
        System.out.println(y);
    }

    public static void main(String[] args) {
        MainClass obj = new MainClass();
        obj.m1();
        obj.m2();
    }
}
