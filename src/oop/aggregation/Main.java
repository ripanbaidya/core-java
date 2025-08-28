package oop.aggregation;

import java.util.ArrayList;
import java.util.List;

class Book {
    String bookName;
    int bookId;

    public Book(String bookName, int bookId) {
        this.bookName = bookName;
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookId=" + bookId +
                '}';
    }
}
class Library {
    String libraryName;
    List<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }
    public void showLibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java", 1);
        Book book2 = new Book("Python", 2);
        Book book3 = new Book("Ruby", 3);

        Library library = new Library("National Library");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.showLibraryDetails();
    }
}
