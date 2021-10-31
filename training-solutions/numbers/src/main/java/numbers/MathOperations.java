package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("23 + 25 * 4 - 9 / 3?");
        double answer = scanner.nextDouble();
        double solution = 23 + 25 * 4 - 9.0 / 3;
        if (Math.abs(answer - solution) <= 0.0001){
            System.out.println("Well Done");
        } else {
            System.out.println("Wrong");
        }
    }
}
