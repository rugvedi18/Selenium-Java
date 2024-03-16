
## System is predefined class
## PrintStream is type
## out is static PrintStream type of variable
## println and print are built in methods which belongs to PrintStream class

class System
{
    static PrintStream out;
}

## Two methods available in PrintStream :-

System.out.println();
System.out.print();

## JVM - Java Virtual Machine compiles the code

## public is an access modifier which says that we can access the following method everywhere
## static ia a keyword which says JVM can directly execute the main method without using any object
## void says main will not return any value
## methods can take parameters args[] or []args or a[] is a single dimentional array of String type

public static void main (String args[])
{
// execution
// object creation
}

OR

static public void main (String args[])
{

}

## Main method can be overloaded but only when you will change the parameters
## but based on the parameters, JVM will decide which is the actual main method so that it can start execution and object creation from that method

public static void main (int a)
{

}

public static void main (int a, int b)
{

}