package multithreading;

/**
 * In this example, we have two classes: ATM and User.
 * The ATM class has two methods: checkBalance() and withdraw().
 * The checkBalance() method should return the current balance of the ATM, and the withdraw() method should allow a user to withdraw money from the ATM.
 *
 * The User class has properties like name and amount(want to withdraw), and an Reference to the ATM object.
 * It should have a method inside useAtm() which will call the withdraw method of ATM object and then check the balance.
 *
 * The goal is to demonstrate the use of synchronization in Java.
 * We will create multiple threads to simulate multiple users trying to withdraw money from the same ATM.
 * The ATM class should be synchronized to ensure that only one user can withdraw money at a time.
 * The User class should also be synchronized to ensure that only one user can use the ATM at a time.
 *
 * The main method will test the above classes, by creating multiple threads and starting them at the same time.
 * The output should show that the users are taking turns to withdraw money from the ATM.
 */

/**
 * ATM class which has two methods: checkBalance() and withdraw().
 */
class ATM {
    // Synchronized method to check balance
    public synchronized void checkBalance(String name, int balance) {
        System.out.println("Checking balance for " + name + ": " + balance);
    }

    // Synchronized method to withdraw money
    public synchronized void withdraw(String userName, int amount) {
        System.out.println(userName + " is trying to withdraw " + amount);
        // Simulate withdrawal process
        try {
            Thread.sleep(1000); // Simulate time taken to withdraw
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(userName + " has withdrawn " + amount);
    }
}

/**
 * User class which has properties like name and amount(want to withdraw), and an Reference to the ATM object.
 */
class User implements Runnable {
    private final ATM atm;
    private final String name;
    private final int amount;

    public User(ATM atm, String name, int amount) {
        this.atm = atm;
        this.name = name;
        this.amount = amount;
    }

    // Method to simulate using the ATM
    public void useAtm() {
        synchronized (atm) { // Synchronizing on ATM object
            atm.withdraw(name, amount);
            atm.checkBalance(name, amount);
        }
    }

    @Override
    public void run() {
        useAtm(); // Each thread will call this method
    }
}

public class SynchronizationExample2 {
    public static void main(String[] args) {
        ATM atm = new ATM();

        // Creating users and assigning them to threads
        Thread user1 = new Thread(new User(atm, "Ripan", 1000));
        Thread user2 = new Thread(new User(atm, "Torsha", 5000));
        Thread user3 = new Thread(new User(atm, "Rakhi", 2000));

        // Starting threads to simulate concurrent ATM usage
        user1.start();
        user2.start();
        user3.start();

        // Joining threads to ensure main thread waits for them to finish
        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}