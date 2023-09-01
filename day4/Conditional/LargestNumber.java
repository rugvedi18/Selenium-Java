package day4.Conditional;

public class LargestNumber {
    public static void main(String[] args) {

        // Assignment 1 : Largest of 2 numbers using if else and ternary
        int x = 20, y = 10, max, min;
        max = (x > y) ? x : y;
        min = (x < y) ? x : y;
        System.out.println(max + " is larger than " + min);

        // Assignment 2 : Largest of 3 numbers using if else
        int a = 30, b = 20, c = 10;

        if (a > b && a > c) {
            System.out.println(a + "A is largest");
        } else if (b > a && b > c) {
            System.out.println(b + "B is largest");
        } else {
            System.out.println(c + "C is largest");
        }

        // Assignment 3 : smallest of three numbers
        int p = 3, q = 1, r = 2;
        if (p < q && p < r) {
            System.out.println(p + " is smallest");
        } else if (q < p && q < r) {
            System.out.println(q + " is smallest");
        } else {
            System.out.println(r + " is smallest");
        }
    }
}
