package day14;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        // Example 1 - ArithmeticException
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc1.nextInt(); // enter input 0 to see the exception error

        // try and catch are pre defined keywords for handling exceptions
        try {
            System.out.println(100 / num1);
        } catch (ArithmeticException e) // exception name, alias
        {
            System.out.println("You have entered invalid input");
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }

        sc1.close();
    }
}
