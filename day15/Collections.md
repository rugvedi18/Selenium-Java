# Collection

Collection is interface which is available in java.util package.
To represent group of elements/objects/data into single entity.

## Limitations of Array

1. Size of array is fixed
2. Heterogeneous data not allowed (multiple data types are not allowed)

To overcome these limitations, we use collections in Java.s

          Collection (Root interface)                       Map (Interface)
            /                      \                              |
        extended                extended                    HashMap (class)
    List (Child interface)   Set (Child interface)
            |                      |
      implemented by         implemented by
        ArrayList                Hashset
         (Class)                 (Class)

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

# ArrayList - is a class implemented by List Interface

1. heterogeneoud data is allowed (Multiple data types)
2. Insertion order is preserved (Indexing)
3. Duplicate elements are allowed
4. Multiple null values are allowed
