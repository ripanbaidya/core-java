package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * In this example, we will demonstrate how to use {@code FileInputStream} in Java.
 * It will show how to read data from a file using {@code FileInputStream}.
 *
 * To read the data from a file, we will use the {@code read()} method of the {@code FileInputStream} class.
 * We will explore different ways to read data from a file using {@code read()} method.
 *
 * We will explore various commonly used methods of {@code FileInputStream} class:
 */
public class FileInputStreamExample {
    public static void main(String[] args) {
        try{
            /**
             * The {@code FileInputStream} class has various constructors to create an instance.
             * Here, we are using the constructor that takes a file path as a parameter.
             *
             * We have another constructor that takes a {@code File} object as a parameter.
             * For example:
             * File file = new File("src/io/file.txt");
             * FileInputStream fis = new FileInputStream(file);
             * This will create a {@code FileInputStream} object that reads from the specified file.
             */
            FileInputStream fis = new FileInputStream("src/io/file.txt");

            /**
             * reading the first byte from the file.
             * If we print the first byte, it will return the ASCII value of the character.
             * For example, if the first character in the file is 'H', it will return 72.
             */
            int firstByte = fis.read();
            System.out.println("First byte read from file(ascii value): " + firstByte);

            System.out.println("First character read from file(character): " + (char) firstByte);

            /**
             * If we want to read all the bytes from the file, we can use the {@code read()} method.
             * The {@code read()} method will return the number of bytes read from the file.
             * If the end of the file is reached, it will return -1.
             */
            while(fis.available() > 0) {
                /**
                 * Here, the logic says that as long as there are bytes available to read,
                 * we will read the next byte and print the character representation of the byte.
                 */
                int byteData = fis.read();
                System.out.print((char) byteData); // printing the character representation of the byte
            }

            // closing the resources
            fis.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
