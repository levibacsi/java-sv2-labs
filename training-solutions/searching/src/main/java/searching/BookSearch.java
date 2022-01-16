package searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookSearch {
    private List<Book> books = new ArrayList<>();

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public Book findBookByAuthorTitle(String author, String title){
        if (author == null || title == null || author.isBlank() || title.isBlank()){
            throw new IllegalArgumentException("Author or title must not be empty!");
        }

        int index = Collections.binarySearch(books, new Book(author, title));
        if (index < 0) {
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        }
        return books.get(index);
    }
}
