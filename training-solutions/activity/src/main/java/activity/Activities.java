package activity;

import java.util.*;

public class Activities {
    private List<Activity> activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public int numberOfTrackActivities(){
        return (int) activities.stream()
                .filter(ActivityWithTrack.class::isInstance)
                .count();
    }

    public int numberOfWithoutTrackActivities(){
        return (int) activities.stream()
                .filter(ActivityWithoutTrack.class::isInstance)
                .count();
    }

    public List<Report> distancesByTypes(){
        Map<ActivityType, Double> distances = new EnumMap<>(ActivityType.class);

        for (ActivityType at: ActivityType.values()){
            distances.put(at, 0.0);
        }

        for (Activity a: activities){
                distances.put(a.getType(), distances.get(a.getType()) + a.getDistance());
        }
        return reportMaker(distances);
    }

    private List<Report> reportMaker (Map<ActivityType, Double> map){
        List<Report> reports = new ArrayList<>();
        for (ActivityType a: map.keySet()){
            reports.add(new Report(a, map.get(a)));
        }
        return reports;
    }
}
