import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Library library;

    @Before
    public void before(){
        library = new Library(1);

    }

    @Test
    public void getBookCount(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void checkCapacityOfBook(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(1, library.getBookCount());



    }

}
