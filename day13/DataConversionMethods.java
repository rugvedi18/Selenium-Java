package day13;

public class DataConversionMethods {
    public static void main(String[] args) {
        String s1 = "10";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1 + " is " + ((Object) i1).getClass().getSimpleName());

        int i2 = 20;
        String s2 = String.valueOf(i2);
        System.out.println(s2 + " is " + ((Object) s2).getClass().getSimpleName());

    }
}
