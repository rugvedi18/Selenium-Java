package day13;

// this will give error, as private is only accessible within the same class
// class Test {
//     private int x = 100;

//     private void m1() {
//         System.out.println("This is private m1 method");
//     }
// }

public class PrivateTest {
    private int x = 100;

    private void m1() {
        System.out.println("This is private m1 method");
    }

    public static void main(String[] args) {
        PrivateTest pv = new PrivateTest();
        System.out.println(pv.x);
        pv.m1();
    }
}
