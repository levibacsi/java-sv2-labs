package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PaulStreetBoys {
    public static void main(String[] args) {
        PaulStreetBoys psb = new PaulStreetBoys();
        psb.readAndWriteNames();
    }

    private void readAndWriteNames() {
        List<String> paulStreetBoys = new ArrayList<>();
        try {
            paulStreetBoys = Files.readAllLines(Paths.get("src/main/resources/palutcaifiuk.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("File not found.", ioe);
        }
        writeNames(paulStreetBoys);
    }

    private void writeNames(List<String> paulStreetBoys) {
        for (String name : paulStreetBoys) {
            if ("Nemecsek Ernő".equals(name)) {
                System.out.println(name.toLowerCase());
            } else {
                System.out.println(name);
            }
        }
    }
}
