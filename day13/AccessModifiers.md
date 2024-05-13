# Access Modifiers

1. Public - Everywhere without inheritance
2. Protected - In other package but using inheritance
3. Default - Inside other classes within same package
4. Private - In class

Public - We will be able to access the variables/methods inside the class, outside the class and outside the package, in other package we can access without inheritance.

Protected - We will be able to access the variables/methods inside the class, outside the class and outside the package, in other package we can access but through inheritance.

Default - We will be able to access the variables/methods inside and outside the class but inside the same package. If we don't specify anyother access modifier to variables/methods, then they will be default, no need to write default keyword.

Private - We will be able to access the variables/methods only within the class.

# Wrapper classes

In java, for every buil in data type, a corresponding class is available.

Built in data types and their wrapper class -
int (Integer), short (Short), long (Long), float (Float), double (Double), char (Character), boolean (Boolean), byte (Byte)

Every built in class contains certain number of methods already defined.
For eg. string - length(), substring(), trim()... etc.

The wrapper class in java provides the mechanism to convert primitive into object and object into primitive.

# Data conversion methods using wrapper classes

String s1 = "10.50"
String s2 = "20"
String s = "true"

String -> int Integer.parseInt()
String -> double Integer.parseDouble()
String -> boolean Integer.parseBoolean()

int phoneno = 12345678

int -> String String.valueOf(data)
double -> String String.valueOf(data)
boolean -> String String.valueOf(data)
char -> String String.valueOf(data)
