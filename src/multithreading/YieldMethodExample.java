package multithreading;

/**
 * The yield() method is a static method of the Thread class that hints to the thread scheduler that the current
 * thread is willing to pause its execution and let other threads of the same or higher priority execute.
 *
 * It does not guarantee that the current thread will pause or that another thread will run — it’s just a hint to the scheduler.
 *
 * why we use yield method?
 * <ul>
 *     <li> Used to make CPU time available to other threads.
 *     <li> Useful in CPU-intensive operations where fairness is desired.</li>
 *     <li> Helps in thread coordination during testing/demo or avoiding starvation.</li>
 * </ul>
 */
public class YieldMethodExample {
    static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        /**
         * This method is called when the thread is started.
         * It prints the current thread's name and a count from 1 to 5.
         * It yields the thread when the count reaches 3.
         */
        @Override
        public void run() {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Thread is running..." + Thread.currentThread().getName() + " - Count: " + i);
                if (i == 3) {
                    System.out.println(Thread.currentThread().getName() + " is yielding...");
                    Thread.yield(); // Yield the current thread
                }
                try {
                    Thread.sleep(500); // Sleep for 500 milliseconds
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    public static void main(String[] args) {
        MyThread thread = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");

        thread.start();
        thread2.start();
    }
}
