## Definition :-
Aquiring all the properties (variables) and behaviour (methods) from one class to another class

## Advantage :-
1. Reusability
2. Avoid duplication

## Types of Inheritance :-
1. Single       A -> B         (One parent -> One child)
2. Multi level  A -> B -> C    (One parent -> child -> child)
3. Hierarchy    A -> B, A -> C (One parent, Multiple childs)
4. Multiple     A -> C, B -> C (Multiple parents, One child)

Multiple inheritance is not supported in java for classes but it is supported for interfaces.

Even if we do not specify any methods in class, by default classes are extended from object class which contains methods like
wait(), notify(), hashCode(), toString(), etc...
So object class (predefined class) is a parent of all other classes which we create.

Why multiple inheritance is not supported in Java?
- Every class is having dupliacte default methods. That is why we cannot extend class. We can achieve this through interface concept.

## Overriding
- Overriding means a subclass method has the same name and signature as a method in its superclass, changing its behavior.
- Possible only in multiple classes/inheritance (when we have atleast two classes)
- Applicable for methods and variables
- We should not change the definition of method but we can change body. Method names are same.
- Related to inheritance

## Overloading
- Overloading allows multiple methods to have the same name with different parameters.
- Possible in single & multiple classes/inheritance
- We should change the definition of the method. Method names are same.
- Related to polymorphism

## Super keyword
- Related to Overriding
Using object of child class but want to fetch Parent class then super is used
- Super keyword invokes immediate parent class variable and method

// Keywords - static, this, super, final