package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    private List<String> roadMap = Arrays.asList("Budapest", "Érd", "Százhalombatta", "Ercsi", "Adony", "Kulcs", "Rácalmás", "Dunaújváros", "Dunaföldvár", "Paks");

    public void writer() {
        try {
            Files.write(Paths.get("roadmap.txt"), roadMap);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RoadMap roadMap = new RoadMap();
        roadMap.writer();
    }
}
