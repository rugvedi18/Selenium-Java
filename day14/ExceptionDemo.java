package day14;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Program is started..");
        System.out.println("Program is in progress..");

        // Example 1 - ArithmeticException
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc1.nextInt(); // enter input 0 to see the exception error
        System.out.println(100 / num1);
        sc1.close();

        // Example 2 - ArrayIndexOutOfBoundsException
        int a[] = new int[5];

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num2 = sc2.nextInt();
        System.out.print("Enter a position: ");
        int pos = sc2.nextInt();
        a[pos] = num2;
        System.out.println("Your number " + a[pos] + " is at position " + pos);
        sc2.close();

        // Example 3 - NumberFormatException
        String s = "Welcome";
        int num3 = Integer.parseInt(s);
        System.out.println(num3);

        System.out.println("Program is completed..");
        System.out.println("Program is terminated..");
    }
}
