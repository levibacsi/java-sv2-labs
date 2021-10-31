package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    List<Person> students = new ArrayList<>();

    public List<Person> getStudents() {
        return students;
    }

    public void addPerson(Person person){
        students.add(person);
    }


}
