package multithreading;

/**
 * In Java, {@code Thread} class is used to create a thread.
 * Thread class has several constructors to create a thread. Here are some of the commonly used constructors:
 *
 * Thread()	Creates a new thread with a unique name (like Thread-0).
 * Thread(Runnable target)	Creates a new thread that will run the given Runnable task.
 * Thread(Runnable target, String name)	Same as above, but also names the thread.
 * Thread(String name)	Creates a thread with a custom name (but no Runnable)
 */

public class ThreadClassConstructor extends Thread {
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread is running...");
        }
    }
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        // Creating a thread using the default constructor

        // Here we are creating a thread and passing a Runnable object to it and giving it a name
        Thread t1 =new Thread(myRunnable, "Thread-1");
        t1.start();

        // Creating a thread using the constructor that takes a Runnable object
        Thread t2 = new Thread(myRunnable);
        t2.start();
    }
}
