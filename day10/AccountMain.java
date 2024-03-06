package day10;

public class AccountMain {
    public static void main(String[] args) {
        Account accobj = new Account();

        // calling setter methods
        accobj.setAcc_no(1);
        accobj.setName("John");
        accobj.setAmount(30000.521);

        // calling getter methods
        System.out.println("Account number : " + accobj.getAcc_no());
        System.out.println("Account name : " + accobj.getName());
        System.out.println("Account balance : " + accobj.getAmount());
    }
}
