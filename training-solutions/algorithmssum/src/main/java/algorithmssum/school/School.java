package algorithmssum.school;

import java.util.Arrays;
import java.util.List;

public class School {
    public int getNumberOfStudents(List<Integer> headcounts){
        int students = 0;
        for (int s: headcounts){
            students += s;
        }
        return students;
    }
}
