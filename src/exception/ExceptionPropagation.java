package exception;

/**
 * child class will throw the exception to its parents and exception must handle by parent class.
 * or else default exception handler will take care or it.
 *
 */

public class ExceptionPropagation {

    private static void againDoMoreStuff() {
        System.out.println(10/0);
    }

    private static void doMoreStuff() {
        againDoMoreStuff();
    }

    private static void doStuff(){
        doMoreStuff();
    }

    public static void main(String[] args) {

        try{
            doStuff();
        }catch (Exception e){
            System.out.println("exception propagated & handled by parent class");
            System.out.println("exception message : "+e.getMessage());
        }
    }
}
