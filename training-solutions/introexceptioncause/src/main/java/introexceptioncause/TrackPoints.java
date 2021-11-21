package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {
    public List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/tracking.csv"));
    }

    public List<Integer> heightsReader (List<String> gPS){
        List<Integer> heights = new ArrayList<>();
        for (String gps: gPS){
            String[] data = gps.split(";");
            int height = Integer.parseInt(data[2]);
            heights.add(height);
        }
        return heights;
    }

    public void heightDifferenceCalc (List<Integer> heights) {
        for (int i = 0; i < heights.size() - 1; i++) {
            System.out.println(heights.get(i + 1) - heights.get(i));
        }
    }
}
