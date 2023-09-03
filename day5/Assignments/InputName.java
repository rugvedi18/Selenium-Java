package day5.Assignments;

import java.util.Scanner;

public class InputName {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name : ");

        // Read user input as a line of text
        String name = sc.nextLine();

        // Display the input
        System.out.println("Hello " + name + "!");

        // Close the scanner
        sc.close();
    }
}
