package Hackathon;
import java.util.ArrayList;
import java.util.List;

public class Patron {

    private String name;
    private String id;
    private List<Book> borrowedBooks; //List<Book> cannot be creating an object/instance.
    //so you beed to instantiate by using ArrayList<Book>

    //(1)
    //write a constructor header. This constructor only takes two parameters
    // they are name and id
    public Patron(String newName, String newId) {
        this.name = newName;
        this.id = newId;
        this.borrowedBooks = new ArrayList<Book>();
        //instantiation by using ArrayList<Book>
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book); //add that book to borrowedBooks list.
            //call this method from Book class.
            // public void setAvailable(boolean available) {
            //        isAvailable = available;
            //    }
            //and make a decision which actual parameter/argument you will take when this method is invoked
            book.setAvailable(false);
        }

    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setAvailable(true);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
