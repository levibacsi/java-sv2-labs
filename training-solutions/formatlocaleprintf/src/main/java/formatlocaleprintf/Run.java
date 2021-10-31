package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
    private final String RUN_TEXT = "Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %.1f km-t futottál. Csak így tovább!";
    private List<Double> range;
    private String runnerName;

    public Run(String runnerName) {
        this.runnerName = runnerName;
        this.range = new ArrayList<>();
    }

    public void addRun(double km) {
        range.add(km);
    }

    public String printFormattedRunText() {
        String dateString = LocalDate.now().toString();
        int days = range.size();
        double km = range.get(range.size() -1);
        return String.format(RUN_TEXT, runnerName, dateString, days, km);
    }

    public static void main(String[] args) {
        Run run = new Run("Kiss Béla");
        run.addRun(5.3);
        System.out.println(run.printFormattedRunText());
        run.addRun(4.65);
        System.out.println(run.printFormattedRunText());
        run.addRun(7.07);
        System.out.println(run.printFormattedRunText());
        run.addRun(12.82);
        System.out.println(run.printFormattedRunText());
    }
}
