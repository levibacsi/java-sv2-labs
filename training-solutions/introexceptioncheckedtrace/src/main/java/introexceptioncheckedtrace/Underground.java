package introexceptioncheckedtrace;

import java.io.IOException;

public class Underground {
    public static void main (String[] args){
        Operations ops = new Operations();

        try {
            System.out.println(ops.getDailySchedule(ops.readFile()));
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
