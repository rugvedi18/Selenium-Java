package day6;

/*  
1) Declare an array
2) Insert values into array
30 Find size of an array
4) Read single value from an array
5) Read multiple values from an array  */

import java.util.Arrays;

public class SingleDimArray {
    public static void main(String[] args) {
        /*
         * // Approach 1
         * 
         * // 1.declaration
         * int a[] = new int[3];
         * 
         * // 2.insert values
         * a[0] = 100;
         * a[1] = 200;
         * a[2] = 300;
         */

        // Approach 2
        int a[] = { 100, 200, 300 };

        // 3.size of an array
        System.out.println("Length : " + a.length);

        // 4.get single value from array
        System.out.println("Value at 3rd : " + a[2]);

        // get all values
        System.out.println(Arrays.toString(a));

        // get all values using for loop

        for (int i = 0; i < a.length; i++) {
            System.out.println("Values of array : " + a[i]);
        }

        // get all values using for each loop (enhanced for loop)
        for (int x : a) {
            System.out.println(x);
        }

    }
}
