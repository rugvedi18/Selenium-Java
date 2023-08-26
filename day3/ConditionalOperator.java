package day3;

public class ConditionalOperator {
    public static void main(String[] args) {
        // int x = expression ? result1 : result2;

        // Exampl 1
        int a = 100, b = 200;
        int x = a > b ? a : b;
        System.out.println(x);

        // Example 2
        // boolean y = (1 == 2) ? true : false;
        // System.out.println(y);

        // Example 3
        int z = a < b ? 0 : 1;
        System.out.println(z);

        // Example 4
        int age = 16;
        String result = age > 20 ? "Eligble for vote" : "Not eligible for vote";
        System.out.println(result);
    }
}