package collectionapi.queue;

// Queue(I) <-extends Deque(I) <-extends AbstractCollection(C) <-implements ArrayDeque(C)

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        // can use both add(), offer() to add elements
        deque.add("sachin");
        deque.offer("virat");
        deque.add("dhoni");
        deque.offer("rahul");
        deque.add("ankit");

        System.out.println(deque);

        // can use both remove(), poll() to remove elements
        deque.remove(); // remove first element, can also mention specific element to delete
        System.out.println(deque);

        deque.poll(); // remove first element, return null if queue is empty
        System.out.println(deque);

        // can use element(), peek() to get head of the queue
        System.out.println(deque.element());

        System.out.println(deque.peek()); // return null if queue is empty

        // can use peekFirst() and peekLast() to get head and tail of the queue
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        // can use offerFirst() and offerLast() to add element at head and tail of the queue
        deque.offerFirst("kohli");
        deque.offerLast("rohit");

        System.out.println(deque);

    }
}
