package exceptionhandling;

/**
 * This class demonstrates how to handle an ArrayIndexOutOfBoundsException in Java.
 * It attempts to access an index of an array that is out of bounds,
 */
public class ArrayIndexOutOfBoundExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Attempting to access an index that is out of bounds
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching the exception and printing a custom message
            System.out.println("Error: Attempted to access an index that is out of bounds.");
            System.out.println("Exception message: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}
