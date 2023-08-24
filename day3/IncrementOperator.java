package day3;

public class IncrementOperator {
    public static void main(String args[]) {
        // increment operator
        int a = 10, b = 10;
        System.out.println("Before post increment a : " + a);
        System.out.println("Post increment a++ : " + a++); // post increment
        System.out.println("After post increment a : " + a + " Before pre increment b : " + b);
        System.out.println("Pre increment ++b : " + ++b); // pre increment

        // decrement operator
        int x = 10, y = 10;
        System.out.println("Before post decrement x : " + x);
        System.out.println("Post decrement x++ : " + x--); // post decrement
        System.out.println("After post decrement x : " + x + " Before pre decrement y : " + y);
        System.out.println("Pre decrement ++y : " + --y); // pre decrement
    }
}
