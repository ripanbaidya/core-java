package multithreading;

/**
 * In this class Demo1, I will create a thread and run it by extending the Thread class.
 * By extending the Thread class, I must override the run() method to house the logic for the thread.
 * This is the most common method of working with threads in Java.
 * The alternative is to create a new class which implements the Runnable interface and override the run() method.
 */
public class Demo1 extends Thread {
    /**
     * The run() method houses the logic for the thread when you extend the Thread class.
     * To implement custom behavior for your thread, place your code within this method.
     * The @Override annotation is used above the run() method to signify
     * that it overrides the method from the Thread class.
     * This annotation is crucial as it indicates that the method is an override of a superclass method.
     */
    @Override
    public void run() {
        // This is just for demonstration purposes.
        // In a real-world application, you would have some logic here.
        int i = 1;
        while (i < 1000) {
            System.out.println("Thread is running...");
            i++;
        }
    }

    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // In order to run the thread created by extending the Thread class,
        // we must call the start() method on the thread object.
        // This will invoke the run() method in a new thread.
        Demo1 d1 = new Demo1();
        d1.start();

        // This is the main thread of the program, which is responsible for running the main method.
        // It will run concurrently with the thread created above, and will also run an infinite loop to keep the program running.
        // This is just for demonstration purposes - in a real-world application, you would have some logic here that is relevant to the needs of your program.
        int i = 1;
        while (i < 1000) {
            System.out.println("Main thread is running...");
            i++;
        }
    }
}