package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path){
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("File not found", ioe);
        }
    }

    public List<String> validate(List<String> list) {
        List<String> errors = new ArrayList<>();
        for (String line : list) {
            if (!isValid(line)) {
                errors.add(line);
            }
        }
        return errors;
    }

    private boolean isValid(String line) {
        String[] parts = line.split(",");
        try {
            return validateLineLength(parts)
                    && validateLineNumber(parts[0])
                    && validateMeasuredValue(parts[1])
                    && validateName(parts[2]);
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    private boolean validateLineLength(String[] parts) {
        return parts.length == 3;
    }

    private boolean validateLineNumber(String numberString) {
        try {
            Integer.parseInt(numberString);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean validateMeasuredValue(String numberString) {
        try {
            Double.parseDouble(numberString);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean validateName(String nameString) {
        String[] nameParts = nameString.split(" ");
        return nameParts.length >= 2;
    }
}