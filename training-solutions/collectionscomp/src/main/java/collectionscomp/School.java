package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new StudentComparator());
        students.add(new Student("Joe", 173));
        students.add(new Student("Jeremy", 179));
        students.add(new Student("Jill", 169));
        students.add(new Student("Jack", 186));
        students.add(new Student("János", 182));

        System.out.println(students);

        Map<String, Integer> alphabetic = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));

        for (Student student : students) {
            alphabetic.put(student.getName(), student.getHeight());
        }

        System.out.println(alphabetic);
    }
}
