package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        System.out.println("1. Felhasználók listázása\n2. Felhasználó felvétele\nTöbbi: Kilépés");
        System.out.print("Szám: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1) {System.out.println("1. Felhasználók listázása");
        }
        if (num == 2) {System.out.println("Felhasználó felvétele");
        };
    }
}

