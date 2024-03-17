package day12;

// Final Keyword on variable - we cannot change the value of variable
class Test {
    int x = 100;
    final int y = 200; // constant values - we cannot change
}

public class FinalVariable {
    public static void main(String[] args) {
        Test t = new Test();
        t.x = 10;
        System.out.println(t.x);
        // t.y = 20; // cannot assign value to varibale type of final
        System.out.println(t.y);
    }
}
