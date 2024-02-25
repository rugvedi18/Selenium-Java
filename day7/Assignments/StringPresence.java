package day7.Assignments;

// 3. Check string presence in an array
import java.util.Arrays;

public class StringPresence {
    public static void main(String[] args) {
        String[] myArray = { "Hello", "World", "Java" };
        String targetString = "Java";

        boolean isPresent = Arrays.asList(myArray).contains(targetString);
        if (isPresent) {
            System.out.println("String is present in array");
        } else {
            System.out.println("String is not present in array");
        }
    }

}
