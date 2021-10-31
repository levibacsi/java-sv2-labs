package attributes;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("War and Peace");
        System.out.println(book.getTitle());

        book.setTitle("Pride and Prejudice");
        System.out.println(book.getTitle());
    }
}
