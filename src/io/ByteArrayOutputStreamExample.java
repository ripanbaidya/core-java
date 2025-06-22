package io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Demonstrates the use of ByteArrayOutputStream in Java.
 * This example builds a dynamic byte buffer in memory, converts it to a string,
 * and also writes the byte data to a file.
 */
public class ByteArrayOutputStreamExample {

    public static void main(String[] args) {
        // Initialize a ByteArrayOutputStream with default size (32 bytes)
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            // Writing multiple byte arrays into the output stream
            String str1 = "Hello, ";
            String str2 = "world!";
            baos.write(str1.getBytes(StandardCharsets.UTF_8));
            baos.write(str2.getBytes(StandardCharsets.UTF_8));

            // Convert stream content to byte array
            byte[] finalData = baos.toByteArray();

            // Convert to string and display
            String result = baos.toString(StandardCharsets.UTF_8);
            System.out.println("ByteArrayOutputStream content as String:");
            System.out.println(result);

            // Write the byte array content to a file
            writeToFile("src/io/output.txt", finalData);

        } catch (IOException e) {
            System.err.println("Error while writing to ByteArrayOutputStream: " + e.getMessage());
        }
    }

    /**
     * Writes byte array data to a file using FileOutputStream.
     *
     * @param filename the name of the file
     * @param data     the byte array to write
     */
    public static void writeToFile(String filename, byte[] data) {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(data);
            System.out.println("Data successfully written to file: " + filename);
        } catch (IOException e) {
            System.err.println("Failed to write to file: " + e.getMessage());
        }
    }
}
