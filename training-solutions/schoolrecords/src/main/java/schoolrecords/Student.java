package schoolrecords;

import org.decimal4j.util.DoubleRounder;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (name.isBlank() || name.isEmpty()){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public void grading(Mark mark){
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage(){
        int sum = 0;
        for (Mark m: marks){
            sum += m.getMarkType().getValue();
        }
        if (!marks.isEmpty()) {
            return DoubleRounder.round((double) sum / marks.size(), 2);
        } else {
            return 0;
        }
    }

    public double calculateSubjectAverage(Subject subject){
        int sum = 0;
        int counter = 0;
        for (Mark m: marks){
            if (m.getSubject().getSubjectName().equals(subject.getSubjectName())){
                sum += m.getMarkType().getValue();
                counter ++;
            }
        }
        if (counter > 0) {
            return DoubleRounder.round((double) sum / counter, 2);
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        StringBuilder allMarks = new StringBuilder();
        for (Mark mark : marks) {
            allMarks.append(name).append(" marks: ").append(mark.getSubject().getSubjectName()).append(": ").append(mark.getMarkType().getTextValue()).append("(").append(mark.getMarkType().getValue()).append(")");
        }
        return allMarks.toString();
    }

    public String getName() {
        return name;
    }
}
