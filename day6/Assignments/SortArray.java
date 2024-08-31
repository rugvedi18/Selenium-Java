package day6.Assignments;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        // 4. Sorting element in array

        int a[] = { 2, 3, 1, 5, 4 };
        Arrays.sort(a);
        System.out.print("Elements of array in ascending order: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Arrays.sort(a);
        System.out.print("Elements of array in descending order: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
