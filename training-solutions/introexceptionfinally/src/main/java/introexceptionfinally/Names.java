package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Names {
    private List<String> readBooks() {
        try {
            return Files.readAllLines(Paths.get("src/main/resources/names.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("File not found.", ioe);
        }
        finally {
            System.out.println("End of reading");
        }
    }

    public void drFinder (){
        String prefix = "";
        for (int i = 0; i < readBooks().size(); i++)
            if (readBooks().get(i).startsWith("dr.")) {
                prefix = readBooks().get(i);
                i = readBooks().size();
            }
        System.out.println(prefix);
    }

    public static void main(String[] args) {
        Names names = new Names();
        names.drFinder();
    }
}
