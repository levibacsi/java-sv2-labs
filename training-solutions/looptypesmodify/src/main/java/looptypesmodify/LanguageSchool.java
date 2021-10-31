package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Freddy Mercury");
        Student student2 = new Student("Axl Rose");
        Student student3 = new Student("Dio");
        Student student4 = new Student("James Hetfield");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println("Size: " + students.size());

        student1.setActive(false);
        student3.setActive(false);

        List<Student> remove = new ArrayList<>();
        for (Student item : students) {
            if (!item.isActive()) {
                remove.add(item);
            }
        }
        students.removeAll(remove);

        System.out.println("Size: "+ students.size());
    }
}
