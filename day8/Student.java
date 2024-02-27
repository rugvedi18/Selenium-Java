package day8;

public class Student {
    // instance or class variables
    int sid;
    String sname;
    char grade;

    void show() {
        System.out.println(sid + "    " + sname + "   " + grade);
    }

    // Approach 2: access variables using method
    void setData(int id, String name, char g) {
        // local variables
        sid = id;
        sname = name;
        grade = g;
    }

    // Approach 3: using constructor
    Student(int id, String name, char g) {
        // local variables
        sid = id;
        sname = name;
        grade = g;
    }

    // constructor name should be same as class name
    // constructor never returns any value
}
