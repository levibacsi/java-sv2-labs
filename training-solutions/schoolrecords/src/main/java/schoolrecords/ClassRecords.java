package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student student){
        for (Student s: students){
            if (s.getName().equals(student.getName())){
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student){
        for (Student s: students){
            if (s.getName().equals(student.getName())){
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    public double calculateClassAverage(){
        if (students.isEmpty()){
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        double sum = 0;
        for (Student s: students){
            sum += s.calculateAverage();
        }

        if (sum == 0){
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }

        return sum / students.size();
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double sum = 0;
        int counter = 0;
        for (Student s : students) {
            if (s.calculateSubjectAverage(subject) > 0) {
                sum += s.calculateSubjectAverage(subject);
                counter++;
            }
        }
        if (counter > 0) {
            return sum / counter;
        } else {
            return 0;
        }
    }


    public Student findStudentByName(String name){
        if (name.isBlank() || name.isEmpty()){
            throw new IllegalArgumentException("Student name must not be empty!");
        }

        if (students.isEmpty()){
            throw new IllegalStateException("No students to search!");
        }

        for (Student s: students){
            if (s.getName().equals(name)){
                return s;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition(){
        if (students.isEmpty()){
            throw new IllegalStateException("No students to select for repetition!");
        }

        return students.get(random.nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults(){
        List<StudyResultByName> studyResultByNames = new ArrayList<>();
        for (Student s: students){
            studyResultByNames.add(new StudyResultByName(s.getName(), s.calculateAverage()));
        }
        return studyResultByNames;
    }

    public String listStudentNames(){
        if (students.isEmpty()){
            return "No students";
        }

        String names = students.get(0).getName();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < students.size(); i++){
            sb.append(", ").append(students.get(i).getName());
        }
        return names + sb.toString();
    }
}
