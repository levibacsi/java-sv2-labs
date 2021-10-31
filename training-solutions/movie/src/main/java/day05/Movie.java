package day05;
public class Movie {
    private String title;
    private int year;
    private double averageRating;
    private int numberOfRatings;
    private int totalOfRatings;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public double calculateAverage (int rating){
        numberOfRatings ++;
        totalOfRatings += rating;
        averageRating = (double)totalOfRatings/numberOfRatings;
        return averageRating;
    }


}
