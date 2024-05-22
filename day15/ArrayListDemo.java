package day15;

// ArrayList is a predefined class
import java.util.ArrayList;
// import java.util.List;

// 1. Heterogeneous data is allowed (Multiple data types)
// 2. Insertion order is preserved (Indexing)
// 3. Duplicate elements are allowed
// 4. Multiple null values are allowed
// 5. Primitive data types and non-premitive (that is objects) can be stored 

// class Employee {
//     int empno;
//     String empname;

//     void display() {
//         // code
//     }
// }

public class ArrayListDemo {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        // declaration
        ArrayList mylist = new ArrayList();

        // stores only integer
        // ArrayList <Integer> mylist = new ArrayList<Integer>();

        // this is not possible because wwe cannot create a object of interface
        // List mylist = new mylist();

        // but we can create a object of child class that is ArrayList
        // List mylist = new ArrayList();

        // Employee empobj1 = new Employee();
        // Employee empobj2 = new Employee();

        // adding data elements into ArrayList
        mylist.add(100);
        mylist.add(10.50);
        mylist.add("Welcome");
        mylist.add(null);
        mylist.add(true);
        mylist.add(100);
        mylist.add(null);

        // can store objects
        // mylist.add(empobj1);
        // mylist.add(empobj2);

        // size of ArrayList
        System.out.println(mylist.size());

        // print data of ArrayList
        System.out.println(mylist);

        // delete single value from ArrayList
        mylist.remove(0);
        System.out.println("After removing the element" + mylist);

        // inserting new elements
        mylist.add(0, "Java");
        System.out.println("After instering the element" + mylist);

        // fetch specific value from the ArrayList
        System.out.println(mylist.get(2));

        // read all the data one by one from ArrayList
        for (Object x : mylist) // when we create an object it can store any types of data
        {
            System.out.println(x);
        }

        // clear ArrayList
        mylist.clear();
        System.out.println("After clearing the ArrayList" + mylist);

    }
}
