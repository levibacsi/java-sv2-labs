package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person("Al Bundy", LocalDate.of(1999, 1, 23), 1111, 4.5);
        Exam exam = new Exam();

        System.out.println("Name?");
        String name = scanner.nextLine();
        System.out.println("Year of birth?");
        String birthYear = scanner.nextLine();
        System.out.println("Month of birth?");
        String birthMonth = scanner.nextLine();
        System.out.println("Day of birth?");
        String birthDay = scanner.nextLine();
        System.out.println("Post code?");
        String postCode = scanner.nextLine();
        System.out.println("Average of marks?");
        String avgMarks = scanner.nextLine();

        int yearNumber = Integer.parseInt(birthYear);
        int monthNumber = Integer.parseInt(birthMonth);
        int dayNumber = Integer.parseInt(birthDay);
        LocalDate wholeBirthday = LocalDate.of(yearNumber, monthNumber, dayNumber);

        int postCodeNum = Integer.parseInt(postCode);
        double avgMarksNum = Double.parseDouble(avgMarks);

        Person person1 = new Person(name, wholeBirthday, postCodeNum, avgMarksNum);

        exam.addPerson(person);
        exam.addPerson(person1);

        System.out.println(exam.getStudents());

    }
}
