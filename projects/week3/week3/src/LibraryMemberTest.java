/**
 * A test of the book and LibraryMember classes
 * @author CSC 142 - Keiffer
 *
 */
public class LibraryMemberTest {

    public static void main(String[] args) {
        LibraryMember m = new LibraryMember(123456789);

        boolean b; //to check the reutnr values of borrowBook and returnBook

        b = m.borrowBook("Java I"); // should work
        System.out.printf("b = %b (should be true)\n", b);
        b = m.borrowBook("Java II"); // shouldn't work
        System.out.printf("b = %b (should be false)\n", b);
        b = m.returnBook(); // should work
        System.out.printf("b = %b (should be true)\n", b);
        b = m.returnBook(); // shouldn't work
        System.out.printf("b = %b (should be false)\n", b);
    }

}
