package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint (TrackPoint trackPoint){
        trackPoints.add(trackPoint);
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public Coordinate findMaximumCoordinate (){
        double maxLatitude = trackPoints.stream().mapToDouble(t->t.getCoordinate().getLatitude()).max().orElseThrow(()->new IllegalArgumentException("No maximum latitude."));
        double maxLongitude = trackPoints.stream().mapToDouble(t->t.getCoordinate().getLongitude()).max().orElseThrow(()->new IllegalArgumentException("No maximum longitude."));
        return new Coordinate(maxLatitude, maxLongitude);
    }

    public Coordinate findMinimumCoordinate (){
        double minLatitude = trackPoints.stream().mapToDouble(t->t.getCoordinate().getLatitude()).min().orElseThrow(()->new IllegalArgumentException("No minimum latitude."));
        double minLongitude = trackPoints.stream().mapToDouble(t->t.getCoordinate().getLongitude()).min().orElseThrow(()->new IllegalArgumentException("No minimum longitude."));
        return new Coordinate(minLatitude, minLongitude);
    }

    public double getFullElevation(){
        List<Double> heights = new ArrayList<>();
        for (TrackPoint t: trackPoints){
            heights.add(t.getElevation());
        }
        double fullElevation = 0;
        for (int i = 0; i < heights.size()-1; i++) {
            if (heights.get(i+1) - heights.get(i) > 0) {
                    fullElevation += heights.get(i+1) - heights.get(i);
            }
        }
        return fullElevation;
    }

    public double getFullDecrease(){
        List<Double> heights = new ArrayList<>();
        for (TrackPoint t: trackPoints){
            heights.add(t.getElevation());
        }
        double fullDecrease = 0;
        for (int i = 0; i < heights.size()-1; i++) {
            if (heights.get(i+1) - heights.get(i) < 0) {
                fullDecrease += heights.get(i) - heights.get(i+1);
            }
        }
        return fullDecrease;
    }

    public double getDistance(){
        double sumDistance = 0;
        for (int i = 0; i < trackPoints.size() -1; i++){
            sumDistance += trackPoints.get(i).getDistanceFrom(trackPoints.get(i+1));
        }
        return sumDistance;
    }

    public double getRectangleArea(){
        double latitudeChange = findMaximumCoordinate().getLatitude() - findMinimumCoordinate().getLatitude();
        double longitudeChange = findMaximumCoordinate().getLongitude() - findMinimumCoordinate().getLongitude();
        return latitudeChange * longitudeChange;
    }

    public void loadFromGpx(String file){
        Coordinate crd = null;
        try (BufferedReader reader = Files.newBufferedReader(Path.of(file))) {
            String line;

            while((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.contains("<trkpt")) {
                    double lat = Double.parseDouble(line.substring(12, 22));
                    double lon = Double.parseDouble(line.substring(29, 39));
                    crd = new Coordinate(lat, lon);
                }
                if (line.contains("<ele")){
                    double ele = Double.parseDouble(line.substring(5,10));
                    trackPoints.add(new TrackPoint(crd, ele));
                }
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("File not found", ioe);
        }
    }
}
