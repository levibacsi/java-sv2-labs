package controlselection.greetings;

public class Greetings {
        public static final int MINUTES = 60;

        public String greet(int hour, int minutes) {
            int time = hour * MINUTES + minutes;
            if (time >= 5 * MINUTES && time < 9 * MINUTES) {
                return "jó reggelt";
            }
            else if (time >= 9 * MINUTES && time < 18 * MINUTES + 30) {
                return "jó napot";
            }

            else if (time >= 18 * MINUTES && time < 20 * MINUTES) {
                return "jó estét";
            } else {
                return "jó éjt";
            }
        }
}
