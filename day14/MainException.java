package day14;

// exception are in java.lang package

public class MainException {
    public static void main(String[] args) {
        System.out.println("Program is started..");

        try {
            int num = 0;
            System.out.println(100 / num);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e);
        }

        System.out.println("Program is terminated..");
    }
}
