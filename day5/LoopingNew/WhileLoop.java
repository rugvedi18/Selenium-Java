package day5.LoopingNew;

public class WhileLoop {
    public static void main(String[] args) {

        // Example 1 : print 1 to 10 numbers

        int i = 1; // initialization
        while (i <= 10) // condition
        {
            System.out.print(i + " ");
            i++; // incrementation

        }
        System.out.println("\nFinal value of A : " + i);

        // Example 2 : print "Hello" 5 times

        int x = 1;
        while (x <= 3) {
            System.out.println("Hello !");
            x++;
        }

        // Example 3 : print even numbers between 1 to 10
        // Approach 1
        // int num = 2;
        // while (num <= 10) {
        // System.out.print(num + " ");
        // num = num + 2;
        // }

        // Approach 2
        int num = 1;
        while (num <= 10) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            num++;
        }

        // Example 4 : print 10 to 1 numbers
        int y = 10;
        System.out.println();
        while (y >= 1) {
            System.out.print(y + " ");
            y--;
        }
    }
}
