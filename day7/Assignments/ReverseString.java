package day7.Assignments;

// 1. Reverse a string  (s = "abc", reverse string "cba")
public class ReverseString {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }
}
