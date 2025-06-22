package collectionapi.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("apple");
        set.add("banana");
        set.add("orange");

        // displaying elements
        System.out.println("HashSet elements: " + set);

        // Adding duplicate element
        set.add("apple");
        System.out.println("After adding duplicate element: " + set);

        HashSet<String> fruits = new HashSet<>();
        fruits.add("grapes");
        fruits.add("mango");

        // adding elements from collection
        set.addAll(fruits);

        System.out.println("After adding elements from collection: " + set);

        // Removing an element
        set.remove("banana");
        System.out.println("After removing 'banana': " + set);

        // Checking if an element exists
        System.out.println("Does 'apple' exist? " + set.contains("apple"));

        // Getting the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());

        // Clearing the HashSet
        set.clear();
        System.out.println("After clearing the HashSet: " + set);

        // Checking if the HashSet is empty
        System.out.println("Is HashSet empty? " + set.isEmpty());

        // Adding elements again
        set.add("apple");
        set.add("banana");
        set.add("orange");

        // Iterating over the elements using an Iterator
        Iterator<String> iterator = set.iterator();
        System.out.println("Iterating over the HashSet:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
