/**
 * A simple representation of a member of a libray
 * @author CSC 142 - Keiffer
 */
public class LibraryMember {
    //defined by their ssn
    private int ssn;
    //they may havea  book
    private Book book; //book is null for now

    /**
     * creates a libray member given their ssn.
     * Initially the member doesn't have a book
     * @param ssn the social security number of the library
     */
    public LibraryMember(int ssn) {
        this.ssn = ssn;
        //this.book = null; //this is optional since book is already null
    }

    /**
     *  borrows a book from the library given the title of the book
     * @param bookTitle
     * @return true if book could be checked out and false if not
     */
    public boolean borrowBook(String bookTitle) {
        if(book == null) {
            book = new Book(bookTitle);
            System.out.println("You have checked out " + bookTitle + ". Happy reading!");
            return true;
        } else {
            System.out.println("Cannot check out a book until the current book is returned!");
            // \n prints new line & \t prints a tab
            return false;
        }
    }

    /**
     *  returns a book of member back to librarby
     *
     * @return true if the book could be returned and false if not
     */
    public boolean returnBook() {
        if ( book != null ) {
            System.out.println("You have returned the book \"" + book.getTitle() + "\"" );
            book = null;
            return true;
        } else {
            System.out.println("You don't have a book to return!");
            return false;
        }
    }



}
