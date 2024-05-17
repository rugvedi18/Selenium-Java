package day13;

public class WrapperClass {
    public static void main(String[] args) {
        int y = 100; // int is premitive data type and a is a variable
        System.out.println(y);

        Integer z = 200; // Integer is a wrapper class and b is object type of variable
        System.out.println(z);

        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;
        float f = 50.0F;
        double d = 60.0D;
        char c = 'a';
        boolean b2 = true;

        // converting primitive into objects : Autoboxing
        Byte byteobj = b;
        Short shortobj = s;
        Integer intobj = i;
        Long longobj = l;
        Float floatobj = f;
        Double doubleobj = d;
        Character charobj = c;
        Boolean boolobj = b2;

        System.out.println(boolobj);

        // converting objects into primitive : Unboxing
        byte bytevalue = byteobj;
        short shortvalue = shortobj;
        int intvalue = intobj;
        long longvalue = longobj;
        float floatvalue = floatobj;
        double doublevalue = doubleobj;
        char charvalue = charobj;
        // bool boolvalue = boolobj; bool cannot be resolved to a type

        System.out.println(bytevalue);
        System.out.println(shortvalue);
        System.out.println(intvalue);
        System.out.println(longvalue);
        System.out.println(floatvalue);
        System.out.println(doublevalue);
        System.out.println(charvalue);

    }
}
