package day5.Assignments;

import java.util.Scanner;

public class SumOfDigits {
    // Find sum of digits in a number
    public static void main(String[] args) {
        // 5. Find sum of digits in a number

        
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int sum = 0;
        while(num > 0) {
            i nt lastDigit = num % 10;
            num = num/10;
            sum = sum   + lastDigit;
        }
        System.out.println("Sum of digits : " + sum);
    }
}
