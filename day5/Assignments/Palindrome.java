package day5.Assignments;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        // 2. Palindrome number 121 121
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int number1 = number;
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;
        }

        if (reversedNumber == number1) {

            System.out.println("Palindrome number");
        } else {
            // System.out.println(reversedNumber + " " + number1);
            System.out.println("Not palindrome");
        }

        sc.close();
    }
}
