package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {
     public static void main(String[] args) {

            // Try-with-resources statement to automatically close resources
            try (FileReader fileReader = new FileReader("test.txt");
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                System.out.println("An IOException occurred: " + e.getMessage());
            }
        }

}
