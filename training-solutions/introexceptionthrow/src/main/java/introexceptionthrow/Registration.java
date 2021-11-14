package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();

        System.out.println("Hello User\nEnter your name");
        String name = scanner.nextLine();
        try {
            validation.validateName(name);
        }
        catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

        System.out.println("Enter your age");
        String age = scanner.nextLine();
        try {
            validation.validateAge(age);
        }
        catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

        System.out.println("Your registration data are: ");
        System.out.println("Name: " + name + ", Age: " + age);

        System.out.print("Registration: ");
        if (validation.success == false) {
            System.out.print("un");
        }
        System.out.print("successful.");
    }
}
