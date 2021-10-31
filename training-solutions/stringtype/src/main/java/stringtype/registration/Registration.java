package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String [] args){
        UserValidator userValidator = new UserValidator();

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter user name");
        String username = scanner.nextLine();

        System.out.println(userValidator.isValidUsername (username) ? "Correct user name" : "Incorrect user name");

        System.out.println("Enter password");
        String password1 = scanner.nextLine();
        System.out.println("Enter password again");
        String password2 = scanner.nextLine();

        System.out.println(userValidator.isValidPassword (password1, password2) ? "Correct password" : "Incorrect password");

        System.out.println("Enter e-mail address");
        String email = scanner.nextLine();

        System.out.println(userValidator.isValidEmail (email) ? "Correct e-mail address" : "Incorrect e-mail address");
    }
}
