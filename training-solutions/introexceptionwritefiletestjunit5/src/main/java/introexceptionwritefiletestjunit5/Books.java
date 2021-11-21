package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> readBooks() {
        try {
            return Files.readAllLines(Paths.get("src/test/resources/books.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("File not found.", ioe);
        }
    }

    public void writeBooks(Path path) {
        List<String> books = readBooks();
        List<String> betterBookList = new ArrayList<>();
        for (String book : books) {
            String[] temp = book.split(";");
            betterBookList.add(temp[2] + ": " + temp[1]);
        }
        writeBetterListFile(path, betterBookList);
    }

    private void writeBetterListFile(Path path, List<String> readableBooks) {
        try {
            Files.write(path, readableBooks);
        } catch (IOException ioe) {
            throw new IllegalStateException("Write error.", ioe);
        }
    }
}
