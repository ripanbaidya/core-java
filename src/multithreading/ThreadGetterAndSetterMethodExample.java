package multithreading;

/**
 * In this class, we will explore various types of thread getter and setter methods.
 * These methods are used to get and set the properties of a thread.
 * For example, we can get the name of a thread, set the priority of a thread, etc.
 *
 */
public class ThreadGetterAndSetterMethodExample extends Thread{
    public static void main(String[] args) {
        ThreadGetterAndSetterMethodExample t1 = new ThreadGetterAndSetterMethodExample();

        // some commonly used thread getter methods in java
        System.out.println("Getting the name of the thread: "+t1.getName());
        System.out.println("Getting the priority of the thread: "+t1.getPriority());
        System.out.println("Getting the state of the thread: "+t1.getState());
        System.out.println("Getting the ID of the thread: "+t1.getId());
        System.out.println("Getting the thread group of the thread: "+t1.getThreadGroup());
        System.out.println("Getting the context class loader of the thread: "+t1.getContextClassLoader());

        // some commonly used thread setter methods in java
        t1.setName("My Thread");
        t1.setPriority(Thread.MAX_PRIORITY);

        /**
         * Starting the thread
         * after starting the thread, the state of the thread will be changed to RUNNABLE
         */
        t1.start();

        System.out.println("Current state of the thread: "+t1.getState());
    }
}
