package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BooksTest {

    private Books books = new Books();

    @TempDir
    File temporaryFolder;

    @Test
    public void testWriteBooks() throws IOException {
        Path path = temporaryFolder.toPath().resolve("books.txt");
        books.writeBooks(path);
        List<String> expected = Files.readAllLines(path);

        assertEquals(4, expected.size());
        assertEquals("Jókai Mór: Kőszívű ember fiai", expected.get(3));
    }
}