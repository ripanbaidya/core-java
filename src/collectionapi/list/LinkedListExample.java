package collectionapi.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Displaying elements using iterator
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            Integer value = (Integer) iterator.next();
            System.out.print(value+" ");
        }

        // adding element at the beginning
        list.addFirst(5);
        System.out.println("After adding element at the beginning: " + list);

        // Adding element at the end
        list.addLast(40);
        System.out.println("After adding element at the end: " + list);

        // Getting the first element
        System.out.println("First element: " + list.getFirst());

        // Getting the last element
        System.out.println("Last element: " + list.getLast());

        // Removing the first element
        System.out.println("removing the first element: " + list.removeFirst());

        // Removing the last element
        System.out.println("removing the last element: " + list.removeLast());

        // size of the LinkedList
        System.out.println("Size of LinkedList: " + list.size());

        // Checking if an element exists
        System.out.println("Does element alreday exist? " + list.contains(20));

        // Clearing the LinkedList
        list.clear();
        System.out.println("After clearing the LinkedList: " + list);

        // Checking LinkedList is empty or not
        System.out.println("Is LinkedList empty? " + list.isEmpty());
    }
}
