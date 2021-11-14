package introexceptionthrow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number");
        try {
            double positiveNumber = scanner.nextDouble();
            if (positiveNumber <= 0){
                throw new IllegalArgumentException("Error. Not a positive number");
            } else {
                System.out.println("Thanks");
            }
        }
        catch (InputMismatchException ime){
            System.out.println("Error. Not a number");
        }
    }
}
