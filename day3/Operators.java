package day3;

public class Operators {
	public static void main(String[] args) {

		// 1. arithmetic operators + - * / % (a/b gives quotient value and a%b gives
		// reminder value)
		int a = 10, b = 20;
		System.out.println("Addition : " + (a + b)); // System.out.println("Wrong Addition : " + a+b);

		// 2. Relational or comparison operators returns true or false boolean value
		System.out.println(a < b);
		System.out.println(a >= b);

		// 3. Logical oprators
		boolean x = 10 > 20;
		boolean y = 10 < 20;
		System.out.println(x && y); // false
		System.out.println(x || y); // true

	}
}
