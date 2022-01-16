package collectionsmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {
    private Map<String, Integer> inPayments = new HashMap<>();

    public Map<String, Integer> getInpayments() {
        return inPayments;
    }

    public void loadInpayments(Path path){
        try {
            List<String> lines = Files.readAllLines(path);
            createMap(lines);
        }
        catch (IOException ioe){
            throw new IllegalStateException("File not found.");
        }
    }

    private void createMap (List<String> lines){
        for (String line: lines) {
            String[] temp = line.split(": ");
            inPayments.put(temp[0], Integer.parseInt(temp[1]));
        }
    }
}
