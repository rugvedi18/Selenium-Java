package day3;

// Assignment - swapping of two numbers without using third variable

public class Assignment {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swapping : ");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);

        a = a + b; // 30
        b = a - b; // 10
        a = a - b; // 20
        System.out.println("After swapping : ");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }
}
