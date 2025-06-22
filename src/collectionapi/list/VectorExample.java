package collectionapi.list;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);

        // displaying elements
        System.out.println("elements: "+ vector);

        // Adding an element at a specific index
        vector.add(1, 15);
        System.out.println("After adding element at index 1: " + vector);

        // Getting the element at a specific index
        System.out.println("Element at index 2: " + vector.get(2));

        // Removing an element at a specific index
        vector.remove(0);
        System.out.println("After removing element at index 0: " + vector);

        // Checking if an element exist
        System.out.println("element exists: " + vector.contains(30));

        // Getting the size of the Vector
        System.out.println("Size of Vector: " + vector.size());

        // Clearing the Vector
        vector.clear();
        System.out.println("After clearing the Vector: " + vector);

        // Checking if the Vector is empty
        boolean isEmptyVector = vector.isEmpty();
        System.out.println("Is Vector empty? " + vector.isEmpty());
    }
}
