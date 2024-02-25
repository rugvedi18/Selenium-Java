package day5.Assignments;

import java.util.Scanner;

public class InputPalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        // built-in method named reverse() of StringBuffer class
        String strRev = new StringBuffer(str).reverse().toString();

        if (str.equals(strRev)) {
            System.out.println("Palindrome string");
        } else {
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
