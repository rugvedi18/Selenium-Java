# Exception

It is an event which will cause program ternmination.

1. Checked exceptions - which are identified by java compiler
   Eg. Interrupted exception, FileNotFound, ISException

   Checked exceptions can be handled by using Try catch or throws keyword

2. Unchecked exceptions - which are not identified by java compiler
   Eg. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundException

   Unchecked exceptions can only handled by using Try Catch block

Two types of errors :-

1. Syntax
2. Logical

Two ways to handle exception :-

1. try catch block - it handles exception at a statement level (in psvm - try {} catch(ExceptionName){} )

2. throws keyword - it handles exception at a method level (after method name - psvm throws ExceptionName)
