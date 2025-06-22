package multithreading;

/**
 * Demonstrates the classic Producer-Consumer problem using wait() and notify()
 * with a shared buffer that holds a single item.
 */
class SharedBuffer {
    private int item;
    private boolean isProducerTurn = true; // true: producer's turn, false: consumer's turn

    /**
     * Sets an item into the buffer. Waits if it's not the producer's turn.
     * @param item the item to be produced
     */
    public synchronized void setItem(int item) {
        // Wait until it's the producer's turn
        while (!isProducerTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // restore the interrupt status
                System.out.println("Producer interrupted: " + e.getMessage());
            }
        }

        this.item = item;
        isProducerTurn = false;
        System.out.println("Produced item: " + item);
        notify(); // Wake up the consumer
    }

    /**
     * Retrieves an item from the buffer. Waits if it's not the consumer's turn.
     * @return the consumed item
     */
    public synchronized int getItem() {
        while (isProducerTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // restore the interrupt status
                System.out.println("Consumer interrupted: " + e.getMessage());
            }
        }

        isProducerTurn = true;
        System.out.println("Consumed item: " + item);
        notify(); // Wake up the producer
        return item;
    }
}

// Producer thread that produces 10 items
class Producer extends Thread {
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.setItem(i);
            try {
                Thread.sleep(100); // Simulate production delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer sleep interrupted: " + e.getMessage());
            }
        }
    }
}

// Consumer thread that consumes 10 items
class Consumer extends Thread {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.getItem();
            try {
                Thread.sleep(100); // Simulate consumption delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer sleep interrupted: " + e.getMessage());
            }
        }
    }
}

// Main class
public class ProducerConsumerProblem {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        // Create and start producer and consumer threads
        new Producer(buffer).start();
        new Consumer(buffer).start();
    }
}
