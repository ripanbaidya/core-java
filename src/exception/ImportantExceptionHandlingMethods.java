package exception;

/**
 * @classname Throwable
 * @description throwable class defines some methods to handle exception and show exception information on the console.
 * printStackTrace(): used to print name, description and stack trace.
 * getMessage(): print description of exception.
 * toString(): print name, description (belong to Object class and common for all)
 *
 * @author rpan
 * @date 2022-07-27
 */

public class ImportantExceptionHandlingMethods {
    public static void main(String[] args) {

        try{
            String s = null;
            System.out.println(s.length());
        }catch (Exception e){

//            e.getMessage();
//            System.out.println(e);
//
//            e.toString();
//            System.out.println(e);

            e.printStackTrace(); //'System.out.println' is not required to print

        }
    }
}
