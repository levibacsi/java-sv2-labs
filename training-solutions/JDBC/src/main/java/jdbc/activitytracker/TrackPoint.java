package jdbc.activitytracker;

import java.time.LocalDate;

public class TrackPoint {
    private long id;
    private LocalDate time;
    private double lat;
    private double lon;

    public TrackPoint(LocalDate time, double lat, double lon) {
        this.time = time;
        this.lat = lat;
        this.lon = lon;
    }

    public TrackPoint(long id, LocalDate time, double lat, double lon) {
        this.id = id;
        this.time = time;
        this.lat = lat;
        this.lon = lon;
    }

    public long getId() {
        return id;
    }

    public LocalDate getTime() {
        return time;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public boolean isValid() {
        return lat >= -90 && lat <= 90 && lon >= -180 && lon <= 180;
    }
}
