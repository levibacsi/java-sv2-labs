package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {
    private List<Person> everybody;

    public PrimarySchool(List<Person> everybody) {
        this.everybody = everybody;
    }

    public List<Person> getEverybody() {
        return everybody;
    }

    public void addPerson (Person person){
        everybody.add(person);
    }

    public List<Student> getStudents(){
        List<Student> studentList = new ArrayList<>();
        for (Person p: everybody){
            if (p.getAge() < 16){
                Student student = new Student(p.getName(), p.getAddress());
                studentList.add(student);
            }
        }
        return studentList;
    }
}
