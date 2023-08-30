package day4.Conditional;

public class LargestNumber {
    public static void main(String[] args) {
        // Largest of 3 numbers

        int a = 30, b = 20, c = 10;
        // int a = 10, b = 30, c = 20;
        // int a = 10, b = 20, c = 30;

        if (a > b && a > c) {
            System.out.println("A is largest");
        } else if (b > a && b > c) {
            System.out.println("B is largest");
        } else {
            System.out.println("c is largest");
        }
    }
}
