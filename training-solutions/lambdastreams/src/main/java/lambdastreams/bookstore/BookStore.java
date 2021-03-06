package lambdastreams.bookstore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BookStore {
    private List<Book> books = new ArrayList<>();

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public Integer getNumberOfBooks(){
        return books.stream()
                .mapToInt(Book::getPieces)
                .sum();
    }

    public Optional<Book> findNewestBook(){
        return books.stream()
                .max(Comparator.comparingInt(Book::getYearOfPublish));
    }

    public Integer getTotalValue(){
        return books.stream()
                .mapToInt(b -> b.getPrice() * b.getPieces())
                .sum();
    }
}
