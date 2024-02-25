package day7.Assignments;

// 4. Swap two strings
public class SwapStrings {
    public static void main(String[] args) {
        // Swapping with a third variable
        String str1 = "Hello";
        String str2 = "World";
        // String str3 = "";

        System.out.println("Before swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // str3 = str1;
        // str1 = str2;
        // str2 = str3;

        // System.out.println("After swap:");
        // System.out.println("str1: " + str1);
        // System.out.println("str2: " + str2);

        // Swapping without a third variable
        str1 = str1 + str2; // Concatenate str1 and str2
        str2 = str1.substring(0, str1.length() - str2.length()); // Extract str1 from the concatenated string
        str1 = str1.substring(str2.length()); // Extract str2 from the concatenated string

        System.out.println("After swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}
