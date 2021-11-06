package controliteration.division;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divider = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i < number; i++) {
            if (i % divider == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int d = 1;
        while (d < number) {
            if (d % divider == 0) {
                System.out.print(d + " ");
                }
            d++;
        }
    }
}

