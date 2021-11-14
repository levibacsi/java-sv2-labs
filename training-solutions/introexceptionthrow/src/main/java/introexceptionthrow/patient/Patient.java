package introexceptionthrow.patient;

import java.util.Scanner;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name == null || "".equals(name)) {
            throw new IllegalArgumentException("Error. Name is empty.");
        }
        this.name = name;

        SsnValidator ssnValidator = new SsnValidator();
        if (ssnValidator.isValidSsn(socialSecurityNumber)) {
            this.socialSecurityNumber = socialSecurityNumber;
        } else {
            throw new IllegalArgumentException("Invalid SSC number");
        }

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
        Patient patient1 = new Patient("Peter Jackson", "035 882 952", 2008);

        System.out.println(patient1);
    }
}
