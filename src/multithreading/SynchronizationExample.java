package multithreading;

/**
 * This example demonstrates the use of synchronization in Java.
 * <p>
 * We'll create a shared resource - a method {@code display} - which prints the characters of a given string one by one.
 * We'll then create two threads that will simultaneously try to access the same method.
 * <p>
 * By using synchronization, we'll ensure that only one thread can access the method at a time, thus preventing any interference
 * between the threads.
 * <p>
 * The output will show the characters printed in the order they appear in the string, without any mixing of characters.
 */
public class SynchronizationExample {
    /**
     * A class that represents a shared resource.
     * It contains a method {@code display} which prints the characters of a given string one by one.
     */
    static class SharedResource {
        /**
         * A synchronized method that prints the characters of a given string one by one.
         * <p>
         * The method is synchronized, meaning that only one thread can access it at a time.
         * <p>
         * The method is also static, meaning that it can be accessed without creating an instance of the class.
         * @param str the string to be printed
         */
        public synchronized void display(String str) {
            // Loop through the characters of the string and print each one
            for (char ch : str.toCharArray()) {
                System.out.print(ch);
                // Simulate some work
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            // Print a newline character at the end of the string
            System.out.println();
        }
    }

    /**
     * Thread 1
     * A class that represents a thread which will access the shared resource.
     */
    static class Thread1 extends Thread {
        // The shared resource
        private SharedResource resource;

        // Constructor
        public Thread1(SharedResource resource) {
            this.resource = resource;
        }

        @Override
        public void run() {
            // Access the shared resource
            resource.display("Hello World");
        }
    }

    /**
     * Thread 2
     * A class that represents a thread which will access the shared resource.
     */
    static class Thread2 extends Thread {
        // The shared resource
        private SharedResource resource;

        // Constructor
        public Thread2(SharedResource resource) {
            this.resource = resource;
        }

        public void run() {
            // Access the shared resource
            resource.display("Java Programming");
        }
    }

    public static void main(String[] args) {
        // Create a shared resource
        SharedResource resource = new SharedResource();

        // Create two threads which will access the shared resource
        Thread1 thread1 = new Thread1(resource);
        Thread2 thread2 = new Thread2(resource);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}