package day10;

public class Account {
    private int acc_no;
    private String name;
    private double amount;

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}