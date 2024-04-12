## Abstraction

It is a process of hiding the implementation details and showing only functionality to the user.

If you use abstract class, you cannot achieve 100% data abstraction
If you use interface, you can achieve 100% data abstraction

## Interface

1. An interface is a blueprint of class.
   interface i1
   {
   variables
   methods
   }
   Interface contains by default static & final variables.

2. Interface contains abstract methods. (also allows default methods & static methods from java8 onwards)
   Therefore, class can implement a interface but interface cannot implement a class.

## An abstract method is a method contains definition but no body (un-implemented method)

void m(); // only definition, no implementation is called abstract method.

3. Methods in interface are public.
   There are 4 access modifiers - default, public, private, protected

4. Interface supports the functionality of multiple inheritance.

interface extends interface
class implements interface

5. We can create object reference for interface but we cannot instantiate interface.

## Access modifiers in visibility hierarchy

1. Public
2. Default
3. Protetcted
4. Private
