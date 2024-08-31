package day6;
/*  
1) Declare an array
2) Insert values into array
30 Find size of an array
4) Read single value from an array
5) Read multiple values from an array  */

public class TwoDimArray {
    public static void main(String[] args) {
        // Approach 1

        /*
         * // 1.declaration
         * int a[][] = new int[3][2]; // 3 rows 2 columns
         * // 2.insert values
         * // 1st row
         * a[0][0] = 100;
         * a[0][1] = 200;
         * 
         * // 2nd row
         * a[1][0] = 300;
         * a[1][1] = 400;
         * 
         * // 3rd row
         * a[2][0] = 500;
         * a[2][1] = 600;
         */

        // Approach 2

        int a[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };

        // 3.size of an array
        System.out.println("Rows : " + a.length);
        System.out.println("Columns : " + a[0].length);

        // 4.get single value
        System.out.println("Single value : " + a[2][0]);

        // get all values using for loop
        System.out.println("Using for  loop -");

        for (int i = 0; i < a.length; i++) // no. of rows
        {
            for (int j = 0; j < a[i].length; j++) // no. of columns
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Using for each loop -");
        // get all values using for each loop (enhanced for loop)
        for (int x[] : a) // takes one by one row
        {
            for (int y : x) // takes single value of row
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}
