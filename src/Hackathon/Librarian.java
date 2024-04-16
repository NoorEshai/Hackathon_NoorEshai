package Hackathon;

import java.util.List;
import java.util.ArrayList;
public class Librarian {
    private String name;
    private String employeeID;
    private List<Book> books;

    public Librarian(String name, String id) {
        this.name = name;
        this.employeeID = id;
        //create am ArrayList Book type
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        //complete this method
        books.add(book);

    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    // flag 11 ( Q and A)
    // discussion to explain about this method
    // students who asl question and answer to their peers questions actively will get the flag
    // highly recommend to participate actively.
    public void checkoutBook(Book book, Patron patron) {
        if (books.contains(book) && book.isAvailable()) {
            patron.borrowBook(book);
        }
    }

    //create checkinBook method.
    public void checkinBook(Book book, Patron patron) {
        if (books.contains(book)) {
            patron.returnBook(book);
            book.setAvailable(true);
        } else {

            System.out.println("Book is not checked out.");
        }
    } else
    {

        System.out.println("This book does not belong to our library catalog.");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}