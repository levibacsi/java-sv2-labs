package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {
    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        List<String> aidPerPerson = new ArrayList<>();

        try {
            List<String> dataFromFile = Files.readAllLines(path);

            for (String line : dataFromFile) {
                String[] parts = line.split(": ");

                int aid = amount / Integer.parseInt(parts[1]);
                aidPerPerson.add(parts[0] + ": " + aid);
            }
        }
            catch (NullPointerException | IOException | IndexOutOfBoundsException | NumberFormatException | ArithmeticException ex) {
                throw new IllegalStateException("Something went wrong while counting.", ex);
            }
        return aidPerPerson;
    }
}
