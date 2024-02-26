package day8;

public class Employee {

    // variables declaration
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

    // To execute the Java class, you need to have a main method.
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.eid = 101;
        emp1.ename = "John";
        emp1.esal = 50000;
        emp1.job = "Engineer";
        emp1.display();

        System.out.println("");
        Employee emp2 = new Employee();
        emp2.eid = 101;
        emp2.ename = "John";
        emp2.esal = 50000;
        emp2.job = "Engineer";
        emp2.display();
    }
}
