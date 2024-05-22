package day15;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // Declaration
        // Map hm = new HashMap();
        // HashMap hm = new HashMap();

        // for keys = Integer, values = String
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // Adding pairs
        hm.put(101, "John");
        hm.put(102, "David");
        hm.put(103, "Jack");
        hm.put(101, "Scott"); // this will replace the key 101, John

        // printing the data
        System.out.println(hm); // {101=John, 102=David, 103=Jack} sometimes you will not get order in sequence

        System.out.println("Size of HashMap: " + hm.size());

        // remove pair
        hm.remove(102);
        System.out.println("After removing pair " + hm);

        // access value of the key
        System.out.println(hm.get(103));

        // get all the keys from HashMap
        System.out.println("Keys : " + hm.keySet()); // to print only keys
        System.out.println("Values : " + hm.values()); // to print only values

        // to get key with values
        System.out.println("Keys and values : " + hm.entrySet());

        // get all data by looping
        // using FOR EACH loop
        for (int k : hm.keySet()) {
            System.out.println(k + "   " + hm.get(k));
        }
        // 101 Scott
        // 103 Jack

        for (Object obj : hm.entrySet()) {
            System.out.println(obj);
        }
        // 101=Scott
        // 103=Jack

        // clear HashMap
        hm.clear();
        System.out.println("Is HashMap empty: " + hm.isEmpty());
    }
}
