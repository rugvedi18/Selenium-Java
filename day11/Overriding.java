package day11;

class Bank {
    double roi() {
        return 0.0;
    }
}

class ICICI extends Bank {
    double roi() {
        return 10.5;
    }
}

class Axis extends Bank {
    double roi() {
        return 8.5;
    }
}

public class Overriding {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.roi()); // 0.0

        ICICI ic = new ICICI();
        System.out.println(ic.roi()); // 10.5

        Axis ax = new Axis();
        System.out.println(ax.roi()); // 8.5

    }
}
