package day8;

public class EmployeeMain {
    public static void main(String[] args) {

        // Approach 1: access variables using reference variable
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

// To run EmployeeMian.java, first you need to compile both files on root folder
// C:\Users\Rugvedi\Desktop\RJ\Study\AutomationTesting\Selenium-Automation>
// javac day8/Employee.java day8/EmployeeMain.java
// class files will be created for both the files then run
// C:\Users\Rugvedi\Desktop\RJ\Study\AutomationTesting\Selenium-Automation>
// java day8.EmployeeMain