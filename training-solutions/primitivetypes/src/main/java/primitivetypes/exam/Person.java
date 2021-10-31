package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birth;
    private int postCode;
    private double averageMarks;

    public Person(String name, LocalDate birth, int postCode, double averageMarks) {
        this.name = name;
        this.birth = birth;
        this.postCode = postCode;
        this.averageMarks = averageMarks;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public int getPostCode() {
        return postCode;
    }

    public double getAverageMarks() {
        return averageMarks;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                ", postCode=" + postCode +
                ", averageMarks=" + averageMarks +
                '}';
    }
}
