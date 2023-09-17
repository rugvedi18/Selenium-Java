package day5.Assignments;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // 1. Reverse a number
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt(); // 102
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10; // 102 % 10 = 2, 10 % 10 = 0, 1 % 10 = 1
            reversedNumber = reversedNumber * 10 + lastDigit; // 0 * 10 + 2 = 2, 2 * 10 + 0 = 20, 200 + 1 = 201
            number = number / 10; // 102 / 10 = 10, 10 / 10 = 1, 1 / 10 = 0
        }
        System.out.println("Reversed number : " + reversedNumber);

        sc.close();
    }
}
