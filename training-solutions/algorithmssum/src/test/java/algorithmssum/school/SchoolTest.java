package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void getNumberOfStudentsTest() {
        School school = new School();
        List<Integer> headcounts = Arrays.asList(32, 34, 28, 30);

        assertEquals(124, school.getNumberOfStudents(headcounts));
    }
}