package exceptionhandling;

/**
 * RuntimeException and its subclasses are unchecked exceptions.
 * does not checkted by compiler at compile time.
 * explicitly dont need to handle
 * eg. ArrayIndexOutOfBoundsException, NullPointerException, ArithmeticException etc
 */

public class UncheckedExceptionHandling {

    private static void arrayIndexOutOfBound() {
        int[] arr = new int[5];

        try{
            System.out.println(arr[9]); // we are trying to access index 9 which is out of bound
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bound exception");
        }
    }

    private static void nullPointerException() {
        String value = null;

        try{
            System.out.println(value.length()); // we are trying to find the length of null value
        }catch (NullPointerException e){
            System.out.println("null pointer exception");
        }
    }

    private static void arithmeticException() {
        int a = 10, b = 0;

        try{
            System.out.println(a/b); // we are trying to divide by zero
        }catch (ArithmeticException e){
            System.out.println("arithmetic exception");
        }
    }

    private static void numberFormatException() {
        String value = "abc";

        try {
            int val = Integer.parseInt(value); // we are trying to parse string data to int. which is not possible
            System.out.println(val);
        }catch (NumberFormatException e) {
            System.out.println("number format exception");
        }
    }

    public static void main(String[] args) {

//        arrayIndexOutOfBound();
    }
}
