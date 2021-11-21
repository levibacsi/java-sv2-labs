package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Neptun {
    public static void main(String[] args) {
        Neptun neptun = new Neptun();
        List<String> namesAndCodes = new ArrayList<>();

        try {
            namesAndCodes = neptun.readNamesAndCodes();
        }

        catch (IOException ioe) {
            ioe.printStackTrace();
        }

        List<String> codes = new ArrayList<>();
        for (String nameAndCode: namesAndCodes){
            codes.add(nameAndCode.substring(nameAndCode.indexOf(",")+1));
        }
        System.out.println("Neptun codes: " + codes);
    }

    private List<String> readNamesAndCodes () throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/neptun.csv"));
    }

}
