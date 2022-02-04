package activity;

public final class Coordinate {
    private double latitude; // -90 -> +90
    private double longitude; // -180 -> +180

    public Coordinate(double latitude, double longitude) {
        if (latitude < -90 || latitude > 90){
            throw new IllegalArgumentException("Latitude must be between -90 and 90.");
        }

        if (longitude < -180 || longitude > 180){
            throw new IllegalArgumentException("Longitude must be between -180 and 180.");
        }

        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
