package day7;

public class StringOperations {
    public static void main(String[] args) {
        String s1 = "welcome";
        String s2 = " to java";
        String s3 = "   Automation    ";
        String s4 = "WELCOME";

        System.out.println("lenth() - " + s1.length()); // lenth() - length of string

        System.out.println("concat() - " + s1.concat(s2)); // concat() - concat to strings

        System.out.println("Without trim - " + s3 + s3.length());
        System.out.println("trim() - " + s3.trim() + s3.trim().length()); // trim() - removes whitespaces from left and right side

        System.out.println("charAt() - " + s1.charAt(0)); // charAt() - returns  a single char based on index

        System.out.println("contains() - " + s1.contains("wel") + " " + s1.contains("Wel")); // contains() - case sensitive and returns boolean

        System.out.println("equals() - " + s1.equals(s4)); // equals() - it checks for lower and upper cases
        System.out.println("equalsignoreCase() - " + s1.equalsIgnoreCase(s4)); // equalsignoreCase() - it ignores cases

        System.out.println("replace() - " + s4.replace(s3, s4)); // replace() - replaces single or multiple characters in a string

        
    }
}
