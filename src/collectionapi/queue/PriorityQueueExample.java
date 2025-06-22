package collectionapi.queue;

// fifo: first in first out

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();

        // can use both add(), offer() to add elements
        pq.add("sachin");
        pq.offer("virat");
        pq.add("dhoni");
        pq.offer("rahul");
        pq.add("ankit");

        System.out.println(pq); // displaying elements


        // can use both remove(), poll() to remove elements
        pq.remove(); // remove first element, can also mention specific element to delete
        System.out.println(pq);

        pq.poll(); // remove first element, return null if queue is empty
        System.out.println(pq);

        // can use element(), peek() to get head of the queue
        System.out.println(pq.element());

        System.out.println(pq.peek()); // return null if queue is empty

        // iteration through queue
        Iterator it = pq.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
