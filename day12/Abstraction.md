## Abstraction

It is a process of hiding the implementation details and showing only functionality to the user.

If you use abstract class, you cannot achieve 100% data abstraction
If you use interface, you can achieve 100% data abstraction

## Interface

In Java, an interface is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. They are used to define a contract that classes must follow. An interface is abstract by nature, which means it cannot be instantiated directly.

Key Points about Interfaces:
Abstract Methods: Interfaces can declare methods, but they cannot provide implementations for these methods. Classes that implement the interface must provide the implementations.
Multiple Inheritance: Java does not support multiple inheritance for classes, but a class can implement multiple interfaces. This allows a form of multiple inheritance.
Constants: Interfaces can declare constants, which are implicitly public, static, and final.
Default Methods: Since Java 8, interfaces can have default methods. These are methods with a default implementation.
Static Methods: Interfaces can also have static methods. These are called on the interface itself.

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
