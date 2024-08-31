package day6.Assignments;
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) 
    {
        // 3. Search an element in array

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number to check : ");
            int num = sc.nextInt();

            int a[] = { 1, 2, 3, 4, 5 };
            for (int i = 0; i < a.length; i++) 
            {
                if (num == a[i]) 
                {
                    System.out.println(num + " is present");
                    return;
                } 
                else 
                {
                    continue;
                }

            }
            System.out.println(num + " is not present");
            
            sc.close();
        }
    }
}
