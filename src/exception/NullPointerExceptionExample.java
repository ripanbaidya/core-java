package exception;

// This code demonstrates how to handle a NullPointerException in Java.
// It includes a try-catch block to catch the exception and a finally block that executes regardless of whether an exception occurred.
// The example shows how to safely handle a situation where an object might be null.
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;

        try {
            // Attempting to access a method on a null object
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // Catching the NullPointerException
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        } finally {
            // This block will always execute
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
