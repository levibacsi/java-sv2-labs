package jdbc.activitytracker;

import java.time.LocalDateTime;
import java.util.List;

public class Activity {
    private int id;
    private LocalDateTime startTime;
    private String description;
    private ActivityType type;
    private List<TrackPoint> trackPoints;

    public Activity(LocalDateTime startTime, String desc, ActivityType type) {
        this.startTime = startTime;
        this.description = desc;
        this.type = type;
    }

    public Activity(int id, LocalDateTime startTime, String description, ActivityType type) {
        this.id = id;
        this.startTime = startTime;
        this.description = description;
        this.type = type;
    }

    public Activity(int id, LocalDateTime startTime, String description, ActivityType type, List<TrackPoint> trackPoints) {
        this.id = id;
        this.startTime = startTime;
        this.description = description;
        this.type = type;
        this.trackPoints = trackPoints;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDescription() {
        return description;
    }

    public ActivityType getType() {
        return type;
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", description='" + description + '\'' +
                ", type=" + type +
                '}';
    }
}
