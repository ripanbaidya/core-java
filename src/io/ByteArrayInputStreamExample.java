package io;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Demonstrates usage of ByteArrayInputStream in Java.
 * This example reads bytes from a byte array and prints every alternate character.
 */
public class ByteArrayInputStreamExample {
    /**
     * Demonstrates reading from a ByteArrayInputStream and skipping every second byte.
     */
    public static void main(String[] args) {
        // Input byte array simulating source data
        byte[] barr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};

        // Try-with-resources ensures the stream is closed automatically
        try (ByteArrayInputStream bins = new ByteArrayInputStream(barr)) {
            int it;

            // Read bytes from stream until end (-1)
            while ((it = bins.read()) != -1) {
                // Print the current byte (character)
                System.out.println((char) it);

                // Skip one byte after each print (read but ignore)
                bins.read(); // Read and discard the next byte to print alternate characters
            }

        } catch (IOException e) {
            // Print the exception message (although ByteArrayInputStream doesn't usually throw IOExceptions)
            System.err.println("Error reading stream: " + e.getMessage());
        }
    }

    /**
     * Demonstrates reading all characters from a ByteArrayInputStream.
     * Useful for scenarios where you want to process full byte content in memory.
     *
     * @param data the input byte array
     */
    public static void readAllBytes(byte[] data) {
        try (ByteArrayInputStream stream = new ByteArrayInputStream(data)) {
            int b;
            System.out.println("Reading all bytes from ByteArrayInputStream:");
            while ((b = stream.read()) != -1) {
                System.out.print((char) b + " ");
            }
            System.out.println(); // for newline
        } catch (IOException e) {
            System.err.println("Stream error: " + e.getMessage());
        }
    }
}
