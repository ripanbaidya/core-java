package collectionapi.queue;

import java.util.PriorityQueue;
import java.util.Queue;

// String and Wrapper classes are by default Comparable
class Book implements Comparable{
    int id;
    String name, author, publisher;

    public Book(int id, String name, String author, String publisher) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    @Override public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Override public int compareTo(Object o) {
        Book book = (Book) o;

        int id1 = this.id;
        int id2 = book.id;

        // ascendind order sorting
        if(id1 < id2) return -1;
        else if (id1 > id2) return 1;
        else return 0;
    }
}

public class SortingQ1 {
    public static void main(String[] args) {

        Queue<Book> book = new PriorityQueue<>();

        book.add(new Book(10, "system design", "sachin", "abc"));
        book.add(new Book(2, "java", "rahul", "xyz"));
        book.add(new Book(93, "c++", "virat", "pqr"));
        book.add(new Book(40, "c", "ankit", "def"));
        book.add(new Book(56, "python", "dhoni", "ghi"));

        System.out.println(book);

    }
}
