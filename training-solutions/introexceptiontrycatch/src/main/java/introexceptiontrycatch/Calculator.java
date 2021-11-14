package introexceptiontrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int firstNumber = 0;
        int secondNumber = 0;

        try {
            firstNumber = scanner.nextInt(); scanner.nextLine();
        }
        catch (InputMismatchException ime){
            System.out.println("Error. Not an integer");
        }

        System.out.println("Enter another integer");

        try {
            secondNumber = scanner.nextInt(); scanner.nextLine();
        }
        catch (InputMismatchException ime){
            System.out.println("Error. Not an integer");
            scanner.nextLine();
        }

        System.out.println("What operation shall I do?\nPlease press: +, -, * or /");
        String operator = scanner.nextLine();

        try {
            switch (operator) {
                case "+":
                    System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                    break;
                case "-":
                    System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                    break;
                case "*":
                    System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                    break;
                case "/":
                    System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                    break;
                default:
                    System.out.println("Error. Unknown operation");
            }
        }
        catch (ArithmeticException ae){
            System.out.println("Error. Division by 0 is not defined.");
        }
    }
}
