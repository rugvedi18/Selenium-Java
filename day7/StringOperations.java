// 8. Working with Strings in java.
package day7;

public class StringOperations {
    public static void main(String[] args) {
        String s1 = "welcome";
        String s2 = " to java";
        String s3 = "   Automation    ";
        String s4 = "WELCOME";
        String s5 = "abc_@gmail.com";

        // lenth() - length of string
        System.out.println("lenth() - " + s1.length());
        // concat() - concat to strings
        System.out.println("concat() - " + s1.concat(s2));

        System.out.println("Without trim - " + s3 + s3.length());
        // trim() - removes whitespaces from left and right side
        System.out.println("trim() - " + s3.trim() + s3.trim().length());
        // charAt() - returns a single char based on index
        System.out.println("charAt() - " + s1.charAt(0));
        // contains() - case sensitive and returns boolean
        System.out.println("contains() - " + s1.contains("wel") + " " + s1.contains("Wel"));
        // equals() - it checks for lower and upper cases
        System.out.println("equals() - " + s1.equals(s4));
        // equalsignoreCase() - it ignores cases
        System.out.println("equalsignoreCase() - " + s1.equalsIgnoreCase(s4));
        // replace() - replaces single or multiple characters in a string
        System.out.println("replace() - " + s4.replace(s3, s4));

        // substring() - to extract substring from main string
        System.out.println(s1.substring(3, 7)); // come
        // split() - divides the string into multiple parts using delimeter
        String a[] = s5.split("@");
        System.out.println(a[0]); // abc_
        System.out.println(a[1]); // gamil.com
        String b[] = a[0].split("_");
        System.out.println(b[0]); // abc

        /// toUppercase() and toLowercase()
        System.out.println(s5.toUpperCase()); // ABC_@GMAIL.COM
        System.out.println(s4.toLowerCase()); // welcome
    }
}
