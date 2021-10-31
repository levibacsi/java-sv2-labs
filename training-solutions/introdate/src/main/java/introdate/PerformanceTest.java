package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
         Performance performance = new Performance(LocalDate.of(2021, 11, 19), "GnR", LocalTime.of(20, 30), LocalTime.of(22,00));
    System.out.println(performance.getInfo());
    }
}
