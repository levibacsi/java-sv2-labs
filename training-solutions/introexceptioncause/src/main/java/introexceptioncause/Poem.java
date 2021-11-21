package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Poem {
    public static void main(String[] args) {
        List<String> poem = new ArrayList<>();
        try {
            poem = Files.readAllLines(Paths.get("src/main/resources/poem.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("File not found.", ioe);
        }

        for (String words: poem) {
            System.out.print(words.charAt(0));
        }
    }
}
