/**
 * A simple representation of a book
 * @author CSC 142 - Keiffer
 */
public class Book {
    //a book is defined by its title
    private String title;

    /**
     * Constructs a book given its title
     * @param title of the book
     */
    public Book(String title) {
        this.title = title;
    }

    /**
     * returns the title of the Book object
     * @return title
     */
    public String getTitle() {
        return title; //returns address of title but b/c it is string, it can't be modified
    }
}
