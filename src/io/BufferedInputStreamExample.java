package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * This example demonstrates the usage of {@link BufferedInputStream}.
 * It shows how to read from a file using {@link BufferedInputStream}.
 * It also shows how to use the {@link BufferedInputStream#mark(int)} and {@link BufferedInputStream#reset()} methods.
 */
public class BufferedInputStreamExample {
    public static void main(String[] args) {
        File path = new File("src/io/file.txt");

        try (BufferedInputStream bins = new BufferedInputStream(new FileInputStream(path))) {
            // number of bytes available
            System.out.println("Number of bytes available: " + bins.available());

            // reading bytes from the file
            int it = 0;
            while ((it = bins.read()) != -1) {
                // converting byte to char
                System.out.print((char) it);
            }
            System.out.println();

            // return true or false based on whether mark supported or not.
            System.out.println("Is mark supported: " + bins.markSupported());

            // using mark() and reset()
            System.out.println((char) bins.read()); // H
            System.out.println((char) bins.read()); // e

            // mark the current position in the stream
            bins.mark(10);

            System.out.println((char) bins.read()); // l
            System.out.println((char) bins.read()); // l
            System.out.println((char) bins.read()); // o

            // reset the stream to the marked position
            bins.reset();

            System.out.println((char) bins.read()); // H
        } catch (IOException e) {
            System.err.println("Error while reading from file." + e.getMessage());
        }
    }
}