package exception;

/**
 * we use when we manually want to trigger an exception in our code.
 * we can throw any object that is instance of Throwable, or even custom exception which extends Exception and RuntimeException.
 * Program Flow: Once an exception is thrown using throw, the normal flow of the program stops,
 * and control is transferred to the nearest catch block (if present) or it propagates up the call stack.
 */
public class ThrowExample {
    public static void main(String[] args) {

        try {
            System.out.println("inside try block..");
            System.out.println(10/0);
        }catch (ArithmeticException e){
            // here the original exception is ArithmeticException by explicit we throw the NullPointerException and this will show on console.
            throw new NullPointerException();
        }
    }
}
