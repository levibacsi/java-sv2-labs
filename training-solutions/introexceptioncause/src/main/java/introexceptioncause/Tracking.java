package introexceptioncause;

import java.io.IOException;

public class Tracking {
    public static void main(String[] args) {
        TrackPoints trackPoints = new TrackPoints();

        try {
            trackPoints.heightDifferenceCalc(trackPoints.heightsReader(trackPoints.readFile()));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
