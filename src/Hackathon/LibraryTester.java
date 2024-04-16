package Hackathon;

public class LibraryTester {
    public static void main(String[] args) {

        Book b1 = new Book("The Hitchhiker's guide to the Galaxy", "Douglas Adams", "0-330-2584-8", true);
        Book b2 = new Book("The Giving Tree", "Neal Shusterman", "0-312-2345-67", false);

        Patron roya = new Patron("Roya Saba", "001");
        Librarian ayanna = new Librarian("Ayanna Lore", "Libra-SF-001");
        ayanna.addBook(b1);
        ayanna.addBook(b2);

        ayanna.checkoutBook(b1, roya);
        ayanna.checkoutBook(b2, roya);
    }
}
/**

 * Library ourLibrary = new Library();

 *

 *         ourLibrary.addBooks(new Book("The Hitchhiker's guide to the Galaxy","Douglas Adams", 1979));

 *         ourLibrary.addBooks(new Book("Dork Diaries","Rachel Rusell",2009));

 *         ourLibrary.addBooks(new Book("The Giving Tree","Neal Shusterman",1964));

 *         ourLibrary.addBooks(new Book("Schythe", "Neal Shusterman",2016));

 *         ourLibrary.addBooks(new Book("To kill a mockingbird", "Harper Lee",1960));

 *         ourLibrary.addBooks(new Book("Diary of a Wimpy","Jeff Kenny",2007));

 *

 *         ourLibrary.listBooks();

 *

 *         Book oldBook = ourLibrary.findOldestBook();

 *

 *         System.out.println("Oldest book:  \n" + oldBook);

 *

 *         Book recent = ourLibrary.findMostRecentBook();

 *         System.out.println("Most recent book :\n" +  recent);

 */