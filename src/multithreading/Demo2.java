package multithreading;

/**
 * This is a demonstration of how to use the Runnable interface to create a new thread.
 * This class implements the Runnable interface and overrides the run() method, which is the entry point for the thread.
 * The main method will create a new thread and start it, and then it will run an infinite loop to keep the program running.
 */
public class Demo2 implements Runnable {
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

    public static void main(String[] args) {
        // Create a new thread and pass an instance of the Runnable interface to it.
        Demo2 demo2 = new Demo2();
        Thread t = new Thread(demo2);

        // Thread t = new Thread(new Demo2());

        // Start the thread.
        t.start();

        // This is the main thread of the program, which is responsible for running the main method.
        // It will run an infinite loop to keep the program running.
        int i = 1;
        while (i < 1000) {
            System.out.println("Main thread is running...");
            i++;
        }
    }

}