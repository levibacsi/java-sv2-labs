package statements;
import java.util.Scanner;

public class DivByThree {
    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter an integer");
        int number = scanner.nextInt();
        boolean b = number % 3 < 1;
        System.out.println("Divisible by 3: " + b);
    }
}
