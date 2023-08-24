package day2;

public class DataTypes2 
{
	// byte - 1 byte -128 to 127
	// short - 2 bytes -32678 to 32676
	// int - 4 bytes -2147483648 to 2147483647
	// long - 8 bytes
	
	public static void main(String[] args) 
	{
		// Numeric - byte, short, int, long
		
		byte x = -128;
		System.out.println("Byte : " + x);
		
		long z = 1999999999;
		System.out.println("Long max : " + z);
		
		// Decimal - float, double
		
		float price = 15.50F; // f or F
		System.out.println(price);
		
		double d = 123.654645645;
		System.out.println(d);
		
		// store number into decimal and decimal into number
		
		double b = 23; // valid
		System.out.println(b);
		
		//int a = 23.23; // not valid
		
		// primitive
		
		char grade = 'A';
		System.out.println(grade);
		
		boolean bo = true;
		System.out.println(bo);

		// non-primitive / derived data type
		
		String person_name = "John";
		System.out.println(person_name);
		
		// store char in string and string in char
		
		String str = "A"; // valid
		System.out.println(str);
		
		// String str1 = 'A'; // not valid
		
		// char A = 'ABC'; // not valid
		
		int xy = 100; // change the value of a variable
		xy = 200;
		System.out.println(xy); 
		
		System.out.println(); // type Syso and ctrl + space
	}
}