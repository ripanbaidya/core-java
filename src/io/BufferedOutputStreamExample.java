package io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This example demonstrates how to use {@link BufferedOutputStream} to write to a file.
 * It shows how to write a byte array to a file and how to flush the buffer.
 */
public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        // create a file object
        File path = new File("src/io/file.txt");

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path))) {
            // write a byte array to the file
            byte[] message = "Hello Developers".getBytes();
            bos.write(message);

            // flush the buffer to ensure that all data is written to the file
            bos.flush();

            // print a success message
            System.out.println("Success..");
        } catch (IOException e) {
            // print an error message if something goes wrong
            System.err.println("Error while writing to file: " + e.getMessage());
        }
    }
}