package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
    List<String> bookList = new ArrayList<>();

    public List<String> getBooks() {
        return bookList;
    }

    public void addBook(String title) {
        bookList.add(title);
    }

    public void findBookAndSetAuthor(String title, String author){
        int i = bookList.indexOf(title);

        if (i >= 0){
            String authorAndBook = author + ": " + bookList.get(i);
            bookList.set(i, authorAndBook);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Books books = new Books();

        System.out.println("How many new books?");
        int newBooks = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= newBooks; i++) {
            System.out.println("Title" + i + "?");
            String title = scanner.nextLine();
            books.addBook(title);
        }

        System.out.println("Book collection: " + books.getBooks());
        System.out.println();

        System.out.println("Which title should be added an author to?");
        String addAuthor = scanner.nextLine();

        if (books.bookList.contains(addAuthor)) {
            System.out.println("Enter author");
            String author = scanner.nextLine();
            books.findBookAndSetAuthor(addAuthor, author);
        } else {
            System.out.println("Unknown title");
        }
        System.out.println("Book collection: " + books.getBooks());
    }
}
