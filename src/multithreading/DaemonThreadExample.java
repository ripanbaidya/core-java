package multithreading;

/**
 * This program demonstrates the use of a daemon thread in Java.
 * A daemon thread is a low-priority thread that runs in the background to perform tasks such as garbage collection.
 * The JVM exits when only daemon threads are left running.
 */
public class DaemonThreadExample {
    static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Daemon Thread is running..." + Thread.currentThread().getName() + " - Count: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Main thread is running..." + Thread.currentThread().getName());

        MyThread thread = new MyThread("Thread-1");
        thread.setDaemon(true); // Set the thread as a daemon thread
        thread.start(); // Start the thread

        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main thread is finished.");
    }
}


