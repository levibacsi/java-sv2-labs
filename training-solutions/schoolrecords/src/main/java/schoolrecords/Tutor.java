package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {
    private String name;
    private List<Subject> taughtSubjects = new ArrayList<>();

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getTaughtSubjects() {
        return taughtSubjects;
    }

    public boolean tutorTeachingSubject(Subject subject){
        for (Subject s: taughtSubjects){
            if (subject.getSubjectName().equals(s.getSubjectName())){
                return true;
            }
        }
        return false;
    }
}
