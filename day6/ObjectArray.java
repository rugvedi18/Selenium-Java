package day6;

public class ObjectArray {
    public static void main(String[] args) {
        
        // object type array can contain any type of data
        Object a[] = {10, 10.5, "Welcome", true, 'A'};
        
        /*
        for(int i=0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
        */

        // enhanced for loop

        for(Object x:a)
        {
            System.out.println(x);
        }
    }
}
