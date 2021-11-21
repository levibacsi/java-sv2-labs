package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {
    public List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/underground.txt"));
    }

    public String getDailySchedule(List<String> carList){
        StringBuilder sb = new StringBuilder();

        sb.append(LocalDate.now().toString()).append(",");

        for (String car: carList){
            if (car.startsWith("2")){
                sb.append(" ").append(car);
            }
        }
        return sb.toString();
    }
}
