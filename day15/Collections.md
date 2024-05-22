# Collection

Collection is interface which is available in java.util package.
To represent group of elements/objects/data into single entity.

## Limitations of Array

1. Size of array is fixed
2. Heterogeneous data not allowed (multiple data types are not allowed)

To overcome these limitations, we use collections in Java.s

          Collection (Root interface)                       Map (Interface)
            /                      \                              |
         extends                 extends                   HashMap (class)
    List (Child interface)   Set (Child interface)
            |                        |
      implements                implements
     ArrayList(Class)          Hashset(Class)

# Interface vs Class

Interfaces ensure that all vehicle types have a common set of behaviors,
while classes provide specific implementations for each type of vehicle.

Example :-

public interface Vehicle
{
void start();
void stop();
int getNumberOfwheels();
}

public class Truck implements Vehicle {
private String make;
private String model;

    // Constructor
    public Truck(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(make + " " + model + " truck is starting.");
    }

    @Override
    public void stop() {
        System.out.println(make + " " + model + " truck is stopping.");
    }

    @Override
    public int getNumberOfWheels() {
        return 6; // Typically, a truck has more wheels
    }

}

# ArrayList - is a class implements List Interface

1. Heterogeneous data is allowed (Multiple data types)
2. Insertion order is preserved (Indexing)
3. Duplicate elements are allowed
4. Multiple null values are allowed

# HashSet - is a class implements Set Interface

1. Heterogeneous data is allowed (Multiple data types)
2. Insertion order is not preserved (Indexing not supported) Data is stored randomly by searching free space available.
3. Duplicate elements are not allowed
4. Multiple null values are not allowed/ only single null value is allowed.

# HashMap - is a class implements Map Interface

1. Data can be stored in the form of key-value pairs.
2. Key is unique but we can have duplicate values.
3. Insertion order is not preserved (Indexing not supported)
