package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    public String nameConcat (String lastName, String firstName){
         return lastName + ", " + firstName;
    }

    public LocalDate birthDater (int birthYear, int birthMonth, int birthDay){
        return LocalDate.of(birthYear, birthMonth, birthDay);
    }

    public static void main(String[] args) {
        Registration registration = new Registration();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last name?");
        String lastName = scanner.nextLine();
        System.out.println("First name?");
        String firstName = scanner.nextLine();


        System.out.println("Birth year?");
        int birthYear = scanner.nextInt();
        System.out.println("Birth month?");
        int birthMonth = scanner.nextInt();
        System.out.println("Birth day?");
        int birthDay = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Email address?");
        String email = scanner.nextLine();

        String fullName = registration.nameConcat(lastName, firstName);
        LocalDate dateOfBirth = registration.birthDater(birthYear, birthMonth, birthDay);

    Person person = new Person(fullName, dateOfBirth, email);
        System.out.println("Your reg. data are: " + person );
    }



}
