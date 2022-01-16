package collectionsset;

import java.sql.Array;
import java.util.*;

public class PhysicalEducation {
    private List<Student> students = new ArrayList<>();

    public PhysicalEducation(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Set<Integer> getOrderInLessons(List<Student> students){
        Set<Integer> heights = new TreeSet<>();

        for (Student s: students){
            heights.add(s.getHeight());
        }
        return heights;
    }

    public static void main(String[] args) {
        PhysicalEducation pe = new PhysicalEducation(new ArrayList <>(Arrays.asList(new Student("Jane", 167),
                new Student("Jill", 171), new Student("Jackie", 164))));

        System.out.println(pe.getOrderInLessons(pe.getStudents()));
    }
}
