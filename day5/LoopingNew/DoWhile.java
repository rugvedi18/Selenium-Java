package day5.LoopingNew;

public class DoWhile {
    public static void main(String[] args) {
        // Example 1 : print from 1 to 10 numbers
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);

        System.out.println();
        // Example 2 : print from 10 to 1 numbers
        int x = 10;
        do {
            System.out.print(x + " ");
            x--;
        } while (x >= 1);
    }
}
