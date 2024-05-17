package day13;

public class Test1 {

    // private - can be access only within a class
    private int a = 100;

    private void m1() {
        System.out.println("This is m1 private method");
    }

    public void someOtherMethod() {
        System.out.println(a);
        m1();
    }

    // default - can be access within the package
    int b = 200;

    void m2() {
        System.out.println("This is m2 default method");
    }

    // protected - can be access outside the package using inheritance
    protected int c = 300;

    protected void m3() {
        System.out.println("This is m3 protected method");
    }

    // public - can be access everywhere without using inheritance
    public int d = 400;

    public void m4() {
        System.out.println("This is m4 public method");
    }
}
