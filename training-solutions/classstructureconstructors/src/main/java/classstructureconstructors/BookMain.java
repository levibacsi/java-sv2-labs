package classstructureconstructors;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("John Taylor", "My First Book");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registration number for "+ book.getAuthor() + " - " + book.getTitle() + "?");
        String regNumber = scanner.nextLine();
        book.register(regNumber);
        System.out.println(book.getAuthor() + " - " + book.getTitle() + " is registered as: " + regNumber);
    }
}
