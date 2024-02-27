package day8;

public class Employee {
    // Approach 1: access variables using reference variable
    int eid;
    String ename;
    String job;
    int esal;

    // methods
    void display() {
        System.out.println("Emp id : " + eid);
        System.out.println("Emp name : " + ename);
        System.out.println("Emp job : " + job);
        System.out.println("Emp salary : " + esal);
    }
}
