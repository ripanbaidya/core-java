package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * use to throw an exception from a method.
 *  The throws keyword declares exceptions a method might throw, while the throw keyword is used to explicitly throw an exception.
 *  commonly used for handling checked exceptions.
 *  can declare multiple exceptions in a method signature by separating them with commas.
 */
public class ThrowsExample {

    private static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);

        System.out.println("file read successfully");
    }

    public static void main(String[] args)  {

        try {
            // parent class mush handle the exception either by using try catch block or throws keyword
            readFile("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("file not found exception");
        }

    }
}
