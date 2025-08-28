package oop.association;

import java.util.ArrayList;
import java.util.List;

class Library {
    private String libraryName;
    private List<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showLibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Books Collection: ");
        for (Book book : books) {
            System.out.println(book.getBookName());
        }
    }

    public String getLibraryName() {
        return libraryName;
    }
}
class Book {
    private String bookName;
    private Library library;

    public Book(String bookName, Library library) {
        this.bookName = bookName;
        this.library = library;
    }

    public String getBookName() { return bookName; }

    public void showBookDetails() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Libray: " + library.getLibraryName());
    }
}
public class Main {
    public static void main(String[] args) {
        Library library = new Library("National Library");

        Book b1 = new Book("Java", library);
        Book b2 = new Book("Python", library);

        library.addBook(b1);
        library.addBook(b2);

        library.showLibraryDetails();
    }
}
