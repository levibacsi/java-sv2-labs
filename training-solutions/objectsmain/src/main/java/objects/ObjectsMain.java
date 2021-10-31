package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        new Book();
        System.out.println(new Book());

        Book emptyBook;

        emptyBook = null;
        System.out.println(emptyBook);

        if (emptyBook == null) {
            System.out.println("Null");
        }
        else {
            System.out.println("Not null");
        }

        Book book = new Book();
        System.out.println(book);

        book = null;
        System.out.println(book);

        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();

        System.out.println(book == anotherBook);



        Book[] books = {new Book(), new Book(), new Book()};
        System.out.println(Arrays.toString(books));

        List<Book> booksList = Arrays.asList(new Book(), new Book(), new Book());
        System.out.println(booksList);

        List<Book> booksAnotherList = new ArrayList<>();
        booksAnotherList.add(new Book());
        booksAnotherList.add(new Book());
        booksAnotherList.add(new Book());
        System.out.println(booksAnotherList);
    }
}
