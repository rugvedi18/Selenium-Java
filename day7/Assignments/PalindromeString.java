package day7.Assignments;

// 2. Check string is palindrome (s = aba, output = aba)
public class PalindromeString {
    // .equals() value of variables and == compares objects of variables in java
    public static void main(String[] args) {
        String s1 = "level";
        String strRev = new StringBuffer(s1).reverse().toString();
        if (s1.equals(strRev)) {
            System.out.println(s1 + " is palindrome string");
        } else {
            System.out.println(s1 + " is not a palindrome string");
        }
    }
}
