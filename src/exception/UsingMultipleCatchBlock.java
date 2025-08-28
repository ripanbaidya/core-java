package exception;

/**
 * In multiple catch block order is important.
 * Order: child -> parent
 * In case of wrong order exception will be handled by parent class and message will be printed.
 * message:  "exception xyx has already been caught".
 *
 */
public class UsingMultipleCatchBlock {
    public static void main(String[] args) {

        try{
            System.out.println("inside try block");
            System.out.println(10/0);

        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("inside array index out of bound exception");
        } catch (ArithmeticException arithmeticException){
            System.out.println("inside arithmetic exception");
        } catch (NullPointerException nullPointerException){
            System.out.println("inside null pointer exception");
        } catch (Exception e){
            System.out.println("inside general exception");
            System.out.println(e.getMessage());
        }
    }
}
