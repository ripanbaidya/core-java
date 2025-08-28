package exception;
/**
 * rules:
 * 1. Separate Multiple Exceptions with | operator.
 * 2. No Common Superclass (Except Exception)
 * 3. The catch block can handle multiple types of exceptions as long as they do not have an inheritance relationship.
 * 4. final exception handling variable. here 'e' its final and common for all exceptions mentioned in catch block.
 */

public class UsingMultiCatchBlock {
    public static void main(String[] args) {

        try {
            System.out.println("inside try block..");
            System.out.println(10/0);

        } catch (NullPointerException | ArrayIndexOutOfBoundsException e ){
            System.out.println("inside multi catch block");
            System.out.println(e.getMessage());
        }
    }
}
