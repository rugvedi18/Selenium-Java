package day5.Assignments;

import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {
        // 3. Count number of digits in a number

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        String str = String.valueOf(num);
        int count = str.length();
        System.out.println("Number of digits : " + count);

        // int count = 0;
        // while(num != 0) {
        // num = num/10;
        // ++count;
        // }
        // System.out.print("Number of digits : " + count)
    }
}
