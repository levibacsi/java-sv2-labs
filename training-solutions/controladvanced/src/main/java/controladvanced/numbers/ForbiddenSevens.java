package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = scanner.nextInt();

        for(int i = number; i < number + 20; i++){

        if (number % 7 == 0) {
            System.out.println("X");
            number++;
        } else {
            if (Integer.toString(number).contains("7")) {
                System.out.println("Bye");
                break;
            } else {
                System.out.println(number);
                number++;
                }
            }
        }
    }
}
