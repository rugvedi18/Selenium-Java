public class ForLoop {
    public static void main(String[] args) {

        // Example 1 : print 1 to 10 numbers
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Example 2 : print even numbers

        // for (int x = 2; x <= 10; x += 2) {
        // System.out.println(x);
        // }

        for (int x = 1; x <= 10; x++) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

        // Example 3 : print numbers from 10 to 1
        for (int y = 10; y >= 1; y--) {
            System.out.print(y + " ");
        }
    }
}
