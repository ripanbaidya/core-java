package multithreading;

import java.util.List;

/**
 * This is a simple implementation of the Teacher-Student problem using Java threads.
 * The Teacher will write something on the board, and the Students will read it.
 * Once enough students have read the content, the Teacher will erase it.
 * and write something new. and the Process will repeat.
 */

class WhiteBoard {
    private String content; // The message written by the Teacher
    private boolean isWritten = false; // true if content is written, false otherwise
    private int studentsCount = 0; // Total number of registered students
    private int studentsRead = 0;  // Number of students who have read current content

    // Register a student (increment total student count)
    public synchronized void registerStudent() {
        studentsCount++;
    }

    // Teacher writes content on the whiteboard
    public synchronized void writeContent(String content) {
        // Wait if previous content hasn't been read by all students
        while (isWritten) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                Thread.currentThread().interrupt();
            }
        }

        // Set new content, reset read counter, and notify students
        this.content = content;
        studentsRead = 0;
        isWritten = true;
        System.out.println("\nTeacher wrote: " + content);
        notifyAll();
    }

    // Student reads content from the whiteboard
    public synchronized String getContent(String studentName) {
        // Wait if content hasn't been written yet
        while (!isWritten) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                Thread.currentThread().interrupt();
            }
        }

        // Student reads content
        System.out.println(studentName + " read: " + content);
        studentsRead++;

        // If all students have read, allow teacher to write again
        if (studentsRead == studentsCount) {
            isWritten = false;
            notifyAll(); // Notify the teacher
        }

        return content;
    }
}

/**
 * Teacher thread writes messages to the WhiteBoard.
 * Waits for all students to read before writing the next message.
 */
class Teacher extends Thread {
    private final WhiteBoard board;

    public Teacher(WhiteBoard board) {
        this.board = board;
    }

    @Override
    public void run() {
        List<String> contents = List.of(
                "Hello Students",
                "Welcome to Java",
                "Let's learn Multithreading",
                "The End"
        );

        for (String content : contents) {
            board.writeContent(content);

            try {
                Thread.sleep(2000); // Simulate time taken to write
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                Thread.currentThread().interrupt();
            }
        }

        // Exit the program after all content is written
        System.exit(0);
    }
}

/**
 * Student thread reads messages from the WhiteBoard.
 * Registers itself at the start and continuously reads as teacher writes.
 */
class Student extends Thread {
    private final WhiteBoard board;
    private final String name;

    public Student(String name, WhiteBoard board) {
        this.name = name;
        this.board = board;
    }

    @Override
    public void run() {
        board.registerStudent(); // Register this student

        while(true) {
            board.getContent(name);

            try {
                Thread.sleep(1000); // Simulate time taken to read
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
    }
}

/**
 * Main class to run the Teacher-Student synchronization problem.
 * Starts one Teacher thread and multiple Student threads.
 */
public class TeacherStudentProblem {
    public static void main(String[] args) {
        WhiteBoard board = new WhiteBoard();

        // Create and start the teacher thread
        Teacher teacher = new Teacher(board);

        // Create and start multiple student threads
        Student s1 = new Student("Student-1", board);
        Student s2 = new Student("Student-2", board);
        Student s3 = new Student("Student-3", board);

        s1.start();
        s2.start();
        s3.start();

        teacher.start();
    }
}
