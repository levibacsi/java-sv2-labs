package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent){
        String studentNeptun = student.getNeptun();
        String anotherStudentNeptun = student.getNeptun();
        String studentId = student.getId();
        String anotherStudentId = anotherStudent.getId();

        return studentNeptun.equals(anotherStudentNeptun)
                && studentId.equals(anotherStudentId);
    }
}


