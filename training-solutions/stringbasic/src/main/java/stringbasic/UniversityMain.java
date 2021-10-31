package stringbasic;

import java.util.List;

public class UniversityMain {
    public static void main(String[] args) {
        Person person = new Person("Becky Smith", "beckysmith@gmail.com", "123456789",
                "12345678-12345678-12345678", "12345678910");
        Student student = new Student(person, "ABCD1234", "12121212");
        University university = new University();
        Person anotherPerson = new Person("Nancy Taylor", "nancytayor@gmail.com", "4576894321",
                "32457689-012365434-23454234", "346-6357-9786");
        Student anotherStudent = new Student(anotherPerson, "DADA8798", "282726454");
        Person yetAnotherPerson = new Person("Jonathan McGregor", "jonmcg@gmail.com", "796546846",
                "86546546-87563421-56789354", "245234526335");
        Student yetAnotherStudent = new Student(yetAnotherPerson, "HDFG3462", "67857957");

        student.setCardNumber("SDFG2345234");
        System.out.println(student.getCardNumber());
        System.out.println(university.areEqual(student, anotherStudent));
        System.out.println(university.areEqual(student, yetAnotherStudent));

        List<Student> noStudents = university.getStudents();
        System.out.println(noStudents.size());
        university.addStudent(student);
        List<Student> oneStudent = university.getStudents();
        System.out.println(oneStudent.size());
    }
}
