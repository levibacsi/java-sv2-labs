package schoolrecords;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SchoolRecordsController {

    private ClassRecords classRecords;
    private Tutor tutor = new Tutor("Nagy Csilla",
            Arrays.asList(new Subject("földrajz"),
                    new Subject("matematika"),
                    new Subject("biológia"),
                    new Subject("zene"),
                    new Subject("fizika"),
                    new Subject("kémia")));

    public void initSchool() {
        classRecords = new ClassRecords("Fourth Grade A", new Random(5));
        Student firstStudent = new Student("Kovács Rita");
        Student secondStudent = new Student("Nagy Béla");
        Student thirdStudent = new Student("Varga Márton");
        firstStudent.grading(new Mark(MarkType.A, new Subject("földrajz"), tutor));
        firstStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        firstStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        secondStudent.grading(new Mark(MarkType.A, new Subject("biológia"), tutor));
        secondStudent.grading(new Mark(MarkType.C, new Subject("matematika"), tutor));
        secondStudent.grading(new Mark(MarkType.D, new Subject("zene"), tutor));
        thirdStudent.grading(new Mark(MarkType.A, new Subject("fizika"), tutor));
        thirdStudent.grading(new Mark(MarkType.C, new Subject("kémia"), tutor));
        thirdStudent.grading(new Mark(MarkType.D, new Subject("földrajz"), tutor));
        classRecords.addStudent(firstStudent);
        classRecords.addStudent(secondStudent);
        classRecords.addStudent(thirdStudent);
    }

    public void printMenu() {
        System.out.println(new StringBuilder()
                .append("1. Diákok nevének listázása\n")
                .append("2. Diák név alapján keresése\n")
                .append("3. Diák létrehozása\n")
                .append("4. Diák név alapján törlése\n")
                .append("5. Diák feleltetése\n")
                .append("6. Osztályátlag kiszámolása\n")
                .append("7. Tantárgyi átlag kiszámolása\n")
                .append("8. Diákok átlagának megjelenítése\n")
                .append("9. Diák átlagának kiírása\n")
                .append("10. Diák tantárgyhoz tartozó átlagának kiírása\n")
                .append("11. Kilépés"));
    }

    public void runMenu() {
        int menuNumber = 0;
        do {
            System.out.println("\nKérem válasszon az alábbi menüpontok közül:");
            printMenu();


            Scanner scanner = new Scanner(System.in);
            menuNumber = scanner.nextInt();
            scanner.nextLine();
            switch (menuNumber) {
                case 1:
                    System.out.println("Az osztály diákjai:");
                    System.out.println(classRecords.listStudentNames());
                    break;
                case 2:
                    System.out.println("Kérem adja meg a keresett diák nevét!");
                    String nameToFind = scanner.nextLine();
                    System.out.println(classRecords.findStudentByName(nameToFind));
                    break;
                case 3:
                    System.out.println("Kérem adja meg az új diák nevét!");
                    String newName = scanner.nextLine();
                    Student student = new Student(newName);
                    classRecords.addStudent(student);
                    System.out.println("Új diák hozzáadva.");
                    break;
                case 4:
                    System.out.println("Kérem adja meg a törlendő diák nevét!");
                    String nameToRemove = scanner.nextLine();
                    classRecords.removeStudent(classRecords.findStudentByName(nameToRemove));
                    System.out.println("Diák törölve.");
                    break;
                case 5:
                    System.out.println("A felelő diák:");
                    System.out.println(classRecords.repetition().getName());
                    break;
                case 6:
                    System.out.println("Az osztály tanulmányi átlaga:");
                    System.out.println(classRecords.calculateClassAverage());
                    break;
                case 7:
                    System.out.println("Melyik tantárgy átlagát mutassam?");
                    String subjectAvgToFind = scanner.nextLine();
                    Subject subject = new Subject(subjectAvgToFind);
                    System.out.println(classRecords.calculateClassAverageBySubject(subject));
                    break;
                case 8:
                    System.out.println("Diákok átlaga:");
                    System.out.println(classRecords.listStudyResults());
                    break;
                case 9:
                    System.out.println("Melyik diák átlagát mutassam?");
                    String studentsAverageToFind = scanner.nextLine();
                    Student stud = classRecords.findStudentByName(studentsAverageToFind);
                    System.out.println(stud.calculateAverage());
                    break;
                case 10:
                    System.out.println("Melyik diák átlagát mutassam?");
                    String studentsAverageToFindBySubject = scanner.nextLine();
                    System.out.println("Melyik tantárgy átlagát mutassam?");
                    String averageToFindBySubject = scanner.nextLine();
                    Student studentBySubject = classRecords.findStudentByName(studentsAverageToFindBySubject);
                    Subject subjectToFind = new Subject(averageToFindBySubject);
                    System.out.println(studentBySubject.calculateSubjectAverage(subjectToFind));
                    break;
            }
        } while (menuNumber != 11);
    }

    public static void main(String[] args) {
        ClassRecords classRecords = new ClassRecords("Class 1b", new Random());
        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();
        schoolRecordsController.initSchool();
        schoolRecordsController.runMenu();
    }
}