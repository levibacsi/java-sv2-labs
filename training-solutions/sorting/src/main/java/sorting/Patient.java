package sorting;

import java.time.LocalDateTime;

public class Patient {
    private String name;
    private String taj;
    private LocalDateTime appointment;

    public Patient(String name, String taj, LocalDateTime appointment) {
        this.name = name;
        this.taj = taj;
        this.appointment = appointment;
    }

    public String getName() {
        return name;
    }

    public String getTaj() {
        return taj;
    }

    public LocalDateTime getAppointment() {
        return appointment;
    }
}
