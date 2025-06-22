package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Checked exception: Exceptions that are checked at compile time.
 * The compiler ensures that these exceptions are handled using try-catch
 * blocks or declared in the method signature using `throws`.
 * These exceptions represent conditions that a reasonable application
 * should anticipate and recover from.
 * Examples include:
 * - IOException
 * - SQLException
 * - FileNotFoundException
 *
 * Code using checked exceptions must handle or declare them explicitly.
 */

public class CheckedExceptionHandling {

    private static void fileNotFound()  {
        try {
            File file = new File("file.txt");
            FileReader fileReader = new FileReader(file);

            System.out.println("file read successfully");

        } catch (FileNotFoundException e) {
            System.out.println("file not found exception");
        }
    }

    private static void handleSQLException() {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root123");
            statement = connection.createStatement();

            statement.executeUpdate("INSERT INTO users (id, name) VALUES (1, 'John Doe')");

            System.out.println("Data inserted successfully!");

        } catch (SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
        } finally {
            try {
                // Closing resources
                if (statement != null)  statement.close();
                if (connection != null)     connection.close();
            } catch (SQLException e) {
                System.out.println("Error while closing resources: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {

//        fileNotFound();
    }
}
