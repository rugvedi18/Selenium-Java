package day14;

// checked exceptions will show you the exception on hovering when not using try catch or throws
public class CheckedException {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program is started...");
        System.out.println("Program is in progress...");

        // thread is pre defined class and sleep is a static method
        Thread.sleep(5000);

        // try {
        // Thread.sleep(5000);
        // } catch (InterruptedException e) {
        // e.getMessage();
        // }

        System.out.println("Program is completed...");
        System.out.println("Program is terminated...");

    }
}

// Try catch is statement level exception
// Throws keyword is method level exception