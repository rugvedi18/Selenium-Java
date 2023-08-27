package day4.Conditional;

public class NestedIfElse {
    public static void main(String[] args) {
        if (false) {
            if (false) {
                System.out.println("abc");
            } else {
                System.out.println("xyz");
            }
        } else {
            if (true) {
                System.out.println("in else's true");
            } else {
                System.out.println("123");
            }
        }
    }
}
