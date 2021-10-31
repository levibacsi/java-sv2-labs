package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        System.out.println("Enter five integers.");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.print(i + 1 + ": ");
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
