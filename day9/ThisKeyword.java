package day9;

public class ThisKeyword {

    // class variables
    int x, y;

    // to reduce the memeory, class variables and local variables have same names
    void setData(int x, int y) // local variables
    {
        // this keyword belongs to class variables
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        ThisKeyword th = new ThisKeyword();
        th.setData(10, 20);
        th.display();
    }
}
