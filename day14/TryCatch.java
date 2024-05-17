package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        System.out.println("Program is started..");

        Scanner sc1 = new Scanner(System.in);

        try {

            System.out.print("Enter a number: ");
            int num1 = sc1.nextInt(); // attempt to read an integer

            // attempt division operation
            System.out.println(100 / num1);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: You have entered invalid input: Division by zero is not allowed");
            // e.printStackTrace();
            // System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: You have entered invalid input: Please enter a valid integer");
        }

        System.out.println("Program is terminated..");

        sc1.close();
    }
}
