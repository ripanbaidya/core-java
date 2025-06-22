package multithreading;

public class SynchronizationIntroduction {
    /**
     * <h2>Resource Sharing</h2>
     * <p>Resource sharing occurs when multiple threads access and use the same resource (e.g., variable, file, object).</p>
     * <p>This could be a variable, a file, a database connection, a network connection etc.</p>
     * <p>Resource sharing is a key concept in multi-threading as it allows multiple threads to access the same resource simultaneously.</p>
     */

    /**
     * <h2>Critical Section</h2>
     * <p>A critical section is a part of the code that accesses the shared resource and must not be executed by more than one thread at a time.</p>
     * <p>This is the section of code that is executed while the lock is held.</p>
     * <p>The critical section is the part of the program where the shared resource is accessed and modified.</p>
     */

    /**
     * <h2>Mutual Exclusion</h2>
     * <p>Mutual exclusion is a mechanism which ensures that only one thread can access the critical section at a time.</p>
     * <p>This is achieved by using locks, semaphores, monitors, etc.</p>
     * <p>Mutual exclusion is a key concept in synchronization as it prevents multiple threads from accessing the same resource simultaneously.</p>
     */

    /**
     * <h2>Locking/Mutex</h2>
     * <p>A lock is a mechanism to enforce mutual exclusion by allowing only one thread to acquire the lock and access the resource.</p>
     * <p>A mutex is a special type of lock that is used to protect a critical section of code.</p>
     * <p>Locks can be classified into two types: intrinsic locks and extrinsic locks.</p>
     * <p>Intrinsic locks are built into the language and are acquired automatically, while extrinsic locks are acquired explicitly by the programmer.</p>
     */

    /**
     * <h2>Semaphore</h2>
     * <p>A semaphore is a signaling mechanism that controls access to a resource by multiple threads using permits.</p>
     * <p>A semaphore is a variable or abstract data type used to control access to a common resource by multiple processes in a concurrent system.</p>
     * <p>A semaphore is a non-negative integer variable that is shared between multiple threads.</p>
     * <p>The semaphore is used to count the number of available resources.</p>
     */

    /**
     * <h2>Monitor</h2>
     * <p>A monitor is an object or mechanism that combines mutual exclusion (locking) and inter-thread communication (wait/notify).</p>
     * <p>A monitor is an object that is used to coordinate the interaction between multiple threads.</p>
     * <p>A monitor is a mechanism that allows threads to communicate with each other and synchronize their actions.</p>
     */

    /**
     * <h2>Race Condition</h2>
     * <p>A race condition occurs when the program's output depends on the unpredictable timing of threads, leading to incorrect results.</p>
     * <p>This happens when multiple threads access the same resource and try to modify it at the same time.</p>
     * <p>Race conditions can be avoided by using synchronization mechanisms such as locks, semaphores, monitors, etc.</p>
     */

    /**
     * <h2>Inter thread communication</h2>
     * <p>Inter thread communication is a mechanism that allows threads to communicate with each other, usually to signal state changes.</p>
     * <p>This can be done using wait/notify, join, etc.</p>
     * <p>Inter thread communication is a key concept in synchronization as it allows threads to coordinate their actions.</p>
     */
}