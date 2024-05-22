package day15;

import java.util.HashSet;
// # HashSet - is a class implements Set Interface

// 1. Heterogeneous data is allowed (Multiple data types)
// 2. Insertion order is not preserved (Indexing not supported) Data is stored randomly by searching free space available.
// 3. Duplicate elements are not allowed
// 4. Multiple null values are not allowed/ only single null value is allowed.

public class HashSetDemo {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        // declartion
        HashSet myset = new HashSet();
        // Set myset = new HashSet();

        // insert data
        myset.add(100);
        myset.add(10.50);
        myset.add("Welcome");
        myset.add(null);
        myset.add(true);
        myset.add(100);
        myset.add(null);

        // print data
        System.out.println(myset); // [null, 100, 10.5, Welcome, true]
        // duplicates are printed only once
        // insertion order is not preserved

        // size of HashSet
        System.out.println(myset.size());

        // remove value
        // this is important as insertion order not preserved, indexing not supported
        myset.remove(10.5); // directly pass the value instead of value
        System.out.println("After removing" + myset);

        // insertion
        // it is not possible as data is stored randomly

        // get specific value
        // it is not possible as data dont have index

        // get all values one by one
        for (Object x : myset) {
            System.out.println(x);
        }
    }
}
