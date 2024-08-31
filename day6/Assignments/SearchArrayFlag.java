package day6.Assignments;

import java.util.Scanner;

public class SearchArrayFlag {
    public static void main(String[] args) {
        // 3. Search an element in array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check : ");
        int num = sc.nextInt();

        int a[] = { 1, 2, 3, 4, 5 };
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            if (num == a[i]) {
                found = true;
                break;
            }
            continue;
        }

        if (found) {
            System.out.println(num + " is present");
        } else {
            System.out.println(num + " is not present");
        }
        sc.close();
    }

}
