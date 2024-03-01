# Polymorphism
It can be achieved by using overloading concept.

## Four rules are applicable in overloading :-
1. Method names should be same.
<br>void sum()

2. Number of parameters should be different.
<br>void sum()
<br>void sum(int a, int b)

3. If the number of parameters are same, then data type of parameters should be different.
<br>void sum()
<br>void sum(int a, int b)
<br>void sum(int a, double b)

4. If the data type is also same, then order of parameters should be different.
<br>void sum()
<br>void sum(int a, int b)
<br>void sum(int a, double b)
<br>void sum(double b, int a)