package collectionapi.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> ls = new LinkedHashSet<>();

        ls.add("apple");
        ls.add("banana");
        ls.add("orange");

        System.out.println("elements: " + ls);

        // Adding duplicate element
        ls.add("apple");
        System.out.println("After adding duplicate element: " + ls);

        // Removing an element
        ls.remove("banana");
        System.out.println("After removing 'banana': " + ls);

        // Checking if an element exists
        System.out.println("Does 'apple' exist? " + ls.contains("apple"));

        // Getting the size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + ls.size());

        // Clearing the LinkedHashSet
        ls.clear();
        System.out.println("After clearing the LinkedHashSet: " + ls);

        // Checking if the LinkedHashSet is empty
        System.out.println("Is LinkedHashSet empty? " + ls.isEmpty());

        // adding elements
        ls.add("apple");
        ls.add("banana");
        ls.add("orange");

        // Iterating over the elements using an Iterator
        Iterator<String> it = ls.iterator();
        System.out.println("Iterating over the LinkedHashSet:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
