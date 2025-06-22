package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * This example shows how to copy the content of one file to another file in Java.
 * Suppose we have a file named "source.txt" and all the content of that file is in uppercase.
 * The goal is to copy the content of "source.txt" to another file named "destination.txt" and convert it to lowercase.
 * We will use the {@code FileInputStream} and {@code FileOutputStream} classes to achieve this.
 */
public class CopyingContentFromOneFileToAnotherFileExample {
    public static void main(String[] args) {
        // source file path and destination file path
        File sourceFilePath = new File("src/io/source.txt");
        File destinationFilePath = new File("src/io/destination.txt");
        
        // creating file input and output streams
        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream(destinationFilePath)) {
            
            // content of the source file will be read and stored in a StringBuilder
            StringBuilder sourceFileContent = new StringBuilder();
            
            // reading one byte at a time
            int data;
            while ((data = fis.read()) != -1) {
                // Convert byte to char and append to string
                sourceFileContent.append((char) data);
            }
            
            // writing content to destination file in lowercase
            byte[] contents = sourceFileContent.toString().toLowerCase().getBytes(StandardCharsets.UTF_8);
            fos.write(contents);
            System.out.println("File copied successfully with content converted to lowercase.");
        } catch (IOException e) {
            System.err.println("Error while copying content from one file to another: " + e.getMessage());
        }
    }
}