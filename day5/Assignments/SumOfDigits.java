package day5.Assignments;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // 5. Find sum of digits in a number

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            sum = sum + lastDigit;
        }
        System.out.println("Sum of digits : " + sum);

        sc.close();
    }
}
