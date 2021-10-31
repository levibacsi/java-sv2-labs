package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    public void printStudyGroups(List<String> students) {
        List<String> Group1 = new ArrayList<>();
        List<String> Group2 = new ArrayList<>();

        for (String item: students) {
            if (item.length() <= 10) {
                Group1.add(item);
            } else {
                Group2.add(item);
            }
        }
        System.out.println("Group 1: " + Group1);
        System.out.println("Group 2: " + Group2);
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Jason Donovan", "Shania Twain", "Marilyn Manson", "Kid Rock", "Prince");
            StudyGroup studyGroup = new StudyGroup();
            studyGroup.printStudyGroups(students);
    }
}
