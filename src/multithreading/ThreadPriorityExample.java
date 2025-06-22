package multithreading;

/**
 * This class demonstrates how to set the priority of a thread in Java.
 * The priority of a thread is an integer value that indicates the relative importance of the thread.
 * The higher the priority, the more important the thread is.
 * The default priority of a thread is 5 (NORM_PRIORITY).
 * The minimum priority is 1 (MIN_PRIORITY) and the maximum priority is 10 (MAX_PRIORITY).
 */
public class ThreadPriorityExample extends Thread{
    // Constructor to create a thread with name
    public ThreadPriorityExample(String name){
        super(name);
    }

    @Override
    public void run() {
        // This is just for demonstration purposes.
        // In a real-world application, you would have some logic here.
        int i = 1;
        while (i < 10) {
            System.out.println("Thread is running...");
            i++;
        }
    }
    public static void main(String[] args) {
        ThreadPriorityExample t1 = new ThreadPriorityExample("myThread");

        System.out.println("priority: " + t1.getPriority());
        System.out.println("name: " + t1.getName());
        System.out.println("state: " + t1.getState());

        // start the thread
        t1.start();

        /**
         * there are 10 priority levels in Java
         * MIN_PRIORITY = 1, NORM_PRIORITY = 5, MAX_PRIORITY = 10
         */
        t1.setPriority(Thread.MAX_PRIORITY);

        // get the priority of the thread after setting the priority
        System.out.println("Thread 1 priority after setting: " + t1.getPriority());

        // checking the state of the thread
        System.out.println("state: " + t1.getState());
    }

}
