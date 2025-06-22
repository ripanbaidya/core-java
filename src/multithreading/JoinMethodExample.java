package multithreading;

/**
 * This example shows how to use the join method to make sure that the main thread
 * waits for a specific thread to finish before continuing.
 */
public class JoinMethodExample {
    /**
     * This is a simple thread class that extends the Thread class.
     * It overrides the run() method to provide the functionality of the thread.
     */
    static class MyThread extends Thread {
        @Override
        public void run() {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Thread is running..." + Thread.currentThread().getName() + " - Count: " + i);
                try {
                    Thread.sleep(500); // Sleep for 500 milliseconds
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        // Main thread is running...
        System.out.println("Main thread is running..."+Thread.currentThread().getName());

        MyThread thread = new MyThread();
        thread.start();

        // This will make the main thread wait for the other thread to finish
        joinThread(thread);

        System.out.println("Main thread is finished.");
    }

    /**
     * This method will make the main thread wait for the thread to finish.
     * @param thread the thread to wait for
     */
    private static void joinThread(Thread thread) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}