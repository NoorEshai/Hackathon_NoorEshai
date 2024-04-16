package Hackathon;

/**
 * create four data/attributes/fields - title, author, isbn, isAvailable
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }
    public Book() {
        this("A Game of Thrones","George R. R. Martin","978 - 0553573404", true ) ;
    }
    //(2)
    // create a no-arg constructor. inside of the constructor. you need to initialize
    // following values.
    //title = "your favorite book title"
    //author = "the author of the book"
    // isbn -- you need to find real isbn number for that book
    //isAvailable -- default value is false, but in this constructor , you need to make it true

    // create a constructor taking all four data. (1)


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
