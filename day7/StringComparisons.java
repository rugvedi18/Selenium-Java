package day7;

public class StringComparisons {
    public static void main(String[] args) {
        // == compare objects and equals compare values of objects

        // case 1 - using string
        String s1 = "welcome";
        String s2 = "welcome";
        System.out.println("string == string - " + (s1 == s2));
        System.out.println("string equals string - " + s1.equals(s2));

        // case 2 - using object
        System.out.println();
        String w1 = new String("welcome");
        String w2 = new String("welcome");
        System.out.println("object == object - " + (w1 == w2)); // false
        System.out.println("object equals object - " + w1.equals(w2)); // true

        // case 3
        System.out.println();
        String c1 = "abc";
        String c2 = new String("abc");
        String c3 = c2;

        System.out.println(c1 == c2); // false
        System.out.println(c1.equals(c2)); // true

        System.out.println(c2 == c3); // true
        System.out.println(c2.equals(c3)); // true

    }
}
