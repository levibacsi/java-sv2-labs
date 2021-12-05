package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Bill {
    public List<String> readBillItemsFromFile(Path path){
        List<String> items = new ArrayList<>();
        try {
            items = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return items;
    }
}
