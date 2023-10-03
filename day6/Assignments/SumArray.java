package Assignments;

public class SumArray {
    public static void main(String[] args) {
        // 1. Find sum of elements in array

        int sum = 0;
        int a[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        System.out.println("Sum of elements : " + sum);
    }
}
