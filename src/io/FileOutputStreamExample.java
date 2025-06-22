package io;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * This is a simple example of using {@code FileOutputStream} in Java.
 * It demonstrates how to write data to a file using FileOutputStream.
 *
 * To write the data to a file, we will use the {@code write()} method of the {@code FileOutputStream} class.
 * we will explore different ways to write data to a file using {@code write()} method.
 */
public class FileOutputStreamExample {
    public void writeExample() {
        /**
         * We can write message to a file using {@code write()} method of {@code FileOutputStream} class.
         * and inside the {@code write()} method we can pass the message as a byte array.
         * The {@code write()} method will write the byte array to the file.
         *
         * String message = "Hello, World";
         * byte[] messageBytes = message.getBytes();
         * fos.write(messageBytes);
         * fos.close();
         */

        /**
         * We can also write message to a file using {@code write()} method of {@code FileOutputStream} class.
         * and inside the {@code write()} method we can pass the message as a single byte.
         * The {@code write()} method will write the byte to the file.
         *
         * for(int i = 0; i < message.length(); i++){
         *    fos.write(message.charAt(i));
         * }
         */
    }
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("src/io/file.txt");
            String message = "Hello, World";

            // convert the message to a byte array and write it to the file
            byte[] messageBytes = message.getBytes();
            fos.write(messageBytes);

            /**
             * It is used to return the file channel object associated with the file output stream.
             */
            FileChannel channel =  fos.getChannel();

            /**
             * It is used to return the file descriptor associated with the stream.
             */
            FileDescriptor fd = fos.getFD();

            // closing the resources
            fos.close();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
