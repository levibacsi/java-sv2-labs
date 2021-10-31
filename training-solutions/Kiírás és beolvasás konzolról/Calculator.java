package classstructureio;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an interger.");
        int number_1 = scanner.nextInt();
		System.out.println("Enter another interger.");
		int number_2 = scanner.nextInt();
		System.out.println(number_1 + " + " + number_2);
		System.out.println(number_1 + number_2);
    }
}