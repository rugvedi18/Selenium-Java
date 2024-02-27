package day8;

public class StudentMain {
    public static void main(String[] args) {

        // Approach 1: using reference variable
        // Student stu = new Student();
        // stu.sid = 101;
        // stu.sname = "Jack";
        // stu.grade = 'A';
        // stu.show();

        // Approach 2: using method
        // Student stu = new Student();
        // stu.setData(102, "John", 'B');
        // stu.show();

        // Approach 3: using constructor
        // at the time of object creation, constructor will automatically invoked
        Student stu = new Student(103, "Max", 'C');
        stu.show();
    }

}
