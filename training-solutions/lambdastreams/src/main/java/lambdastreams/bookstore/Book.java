package lambdastreams.bookstore;

public class Book {
    private String title;
    private int yearPublished;
    private int price;
    private int pieces;

    public Book(String title, int yearPublished, int price, int pieces) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.price = price;
        this.pieces = pieces;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublish() {
        return yearPublished;
    }

    public int getPrice() {
        return price;
    }

    public int getPieces() {
        return pieces;
    }
}
