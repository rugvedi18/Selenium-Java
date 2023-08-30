package day4.Conditional;

public class ElseIfLadder {
    public static void main(String[] args) {
        // Positive or negative number
        int num = 5;

        if (num > 0) {
            System.out.println(num + " Number is positive");
        } else if (num < 0) {
            System.out.println(num + " Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // weekdays

        int weekday = 10;

        if (weekday == 1) {
            System.out.println("Monday");
        } else if (weekday == 2) {
            System.out.println("Tuesday");
        } else if (weekday == 3) {
            System.out.println("Wednesday");
        } else if (weekday == 4) {
            System.out.println("Thursday");
        } else if (weekday == 5) {
            System.out.println("Friday");
        } else if (weekday == 6) {
            System.out.println("Saturday");
        } else if (weekday == 1) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid week number");
        }
    }
}
