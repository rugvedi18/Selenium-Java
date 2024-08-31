package day6.Assignments;
public class EvenOddArray {
    public static void main(String[] args) {

        // 2. Print even and odd numbers from array
        
        int ecount = 0, ocount = 0;
        int a[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                ecount = ecount + 1;
                System.out.println(a[i] + " is even");
            } else {
                ocount = ocount + 1;
                System.out.println(a[i] + " is odd");
            }
        }
        System.out.println("Even count : " + ecount);
        System.out.println("Odd count : " + ocount);
    }
}
