package day3;

public class AssignmentOperator {
    public static void main(String[] args) {
        // (purely assignment opeartor) = (shorthand opeartors) += -= *= /= %=
        int a = 10, b = 10;
        a += 5;
        b -= 5;
        System.out.println("a : " + a + ", b : " + b);

        int x = 10, y = 10, z = 10;
        x *= 2;
        y /= 2;
        z %= 2;
        System.out.println("x : " + x + ", y : " + y + ", z : " + z);
    }
}
