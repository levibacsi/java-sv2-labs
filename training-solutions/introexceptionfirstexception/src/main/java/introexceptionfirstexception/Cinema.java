package introexceptionfirstexception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name?");
        String name = scanner.nextLine();
        System.out.println("Movie title?");
        String title = scanner.nextLine();
        System.out.println("Number of tickets?");
        int ticketNumber = scanner.nextInt();
        System.out.println("Which row?");
        int row = scanner.nextInt();


        System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:");
        System.out.println("A vásárló neve: " + name);
        System.out.println("Film címe: " + title);
        System.out.print("Lefoglalt helyek: ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ticketNumber-1; i++){
            sb.append(row).append(". sor ").append(i+1).append(". szék").append(", ");
        }
        System.out.print(sb);
        System.out.print(row + ". sor " + ticketNumber + ". szék");
        System.out.println();

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < ticketNumber; i++) {
            sb2.append(row).append(". sor, ").append(i+1).append(". szék") ;
            if (i != (ticketNumber - 1)) {
                sb2.append(", ");
            }
        }
        System.out.println(sb2);
    }
}
