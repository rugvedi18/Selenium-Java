package day13;

public class MainClass {

    // public class PrivateClass {
    // private int x = 100;

    // private void m1() {
    // System.out.println("This is private m1 method");
    // }
    // }

    public class DefaultClass {
        int y = 100;

        void m2() {
            System.out.println("This is default m2 method");
        }
    }

    public static void main(String[] args) {
        DefaultClass mc = new DefaultClass();
        // System.out.println(mc.x);
        // mc.m1();

        System.out.println(mc.y);
        mc.m2();
    }
}
