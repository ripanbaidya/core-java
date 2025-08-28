package exception;

// This is a simple example of using try-catch to handle exceptions in Java.
public class TryCatchExample {
    public static void main(String[] args) {
        // Example of a try-catch block
        try {
            // This will cause an ArithmeticException
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
