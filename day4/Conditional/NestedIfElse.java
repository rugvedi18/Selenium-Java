package day4.Conditional;

public class NestedIfElse {
    public static void main(String[] args) {
        boolean val = true;
        if (val) {
            if (!val) {
                System.out.println("abc");
            } else {
                System.out.println("xyz");
            }
        } else {
            if (val) {
                System.out.println("in else's true");
            } else {
                System.out.println("123");
            }
        }
    }
}
