package exceptionhandling;

/**
 * finally block will execute irrespective of whether exception is handled or not.
 */
public class UsingFinallyBlock {
    public static void main(String[] args) {

        try{
            System.out.println(10/0);

        } catch (Exception e){
            System.out.println("exception handled");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block called..");
        }
    }
}
