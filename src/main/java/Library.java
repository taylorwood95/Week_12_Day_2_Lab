import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if( capacity > this.books.size()) {this.books.add(book);}

    }

    public int getCapacity() {
        return capacity;
    }




}
