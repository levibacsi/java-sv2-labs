package searching;

import java.time.LocalDate;

public class LostProperty implements Comparable<LostProperty>{
    private String regNumber;
    private String description;
    private LocalDate dateFound;

    public LostProperty(String regNumber, String description, LocalDate dateFound) {
        this.regNumber = regNumber;
        this.description = description;
        this.dateFound = dateFound;
    }

    public LostProperty(String description, LocalDate dateFound) {
        this.description = description;
        this.dateFound = dateFound;
    }

    @Override
    public int compareTo(LostProperty o) {
        if (description.compareTo(o.description) == 0) {
            return (dateFound.compareTo(o.dateFound));
        }
        return description.compareTo(o.description);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LostProperty that = (LostProperty) o;

        if (!description.equals(that.description)) return false;
        return dateFound.equals(that.dateFound);
    }

    @Override
    public int hashCode() {
        int result = description.hashCode();
        result = 31 * result + dateFound.hashCode();
        return result;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDateFound() {
        return dateFound;
    }
}
