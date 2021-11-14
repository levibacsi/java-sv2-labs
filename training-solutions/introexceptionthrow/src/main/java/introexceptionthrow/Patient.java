package introexceptionthrow;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name == null || "".equals(name)){
            throw new IllegalArgumentException("Error. Name is empty.");
        }
            this.name = name;

        this.socialSecurityNumber = socialSecurityNumber;

        if (yearOfBirth < 1900) {
            throw new IllegalArgumentException("Error. Date of birth too early.");
        }

        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public static void main(String[] args) {
        Patient patient = new Patient("George", "123456789", 1990);
        Patient patient2 = new Patient("", "987654321", 1980);
        Patient patient3 = new Patient("Paul", "987123456", 1880);

        System.out.println(patient);
        System.out.println(patient2);
        System.out.println(patient3);
    }
}
