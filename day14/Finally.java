package day14;

public class Finally {
    public static void main(String[] args) {
        System.out.println("Program is started..");

        // String s = null;
        String s = "Welcome";

        try {
            System.out.println(s.length());
        }
        // catch (ArithmeticException e)
        catch (Exception e) {
            System.out.println("Exception thrown: " + e);
        } finally {
            System.out.println("In finally block..");
        }

        System.out.println("Program is terminated..");
    }
}
