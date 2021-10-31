package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;


    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public void registerPerson(int person){
        numberOfPeople += person;
    }

    public void ride(double km){
        kms += km;
    }

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("Tour 1", LocalDate.of(2021, 10, 28));
        System.out.println(cyclingTour.getDescription() + " - " + cyclingTour.getStartTime() + " - "+ cyclingTour.getNumberOfPeople() + " people - " + cyclingTour.getKms() + " km");
        cyclingTour.registerPerson(3);
        cyclingTour.ride(62.3);
        System.out.println(cyclingTour.getDescription() + " - " + cyclingTour.getStartTime() + " - "+ cyclingTour.getNumberOfPeople() + " people - " + cyclingTour.getKms() + " km");
    }
}
