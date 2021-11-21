// A Numbers osztályban addig írd ki a felhasználónak, hogy adjon meg egy számot,
// amíg egyszer páros számot nem ad meg!
// Páros szám beérkezésekor érjen véget a program futása!
// Ha esetleg nem számot adna meg (hanem pl. betűt),
// akkor a keletkező NumberFormatException-t kezeld le
// és dobj helyette egy IllegalArgumentException-t egy megfelelő tájékoztató szöveggel!
// Írj finally ágat is, és abban írd ki minden kör után, hogy “End of round.”

package introexceptionfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        while (number % 2 == 1) {
            try {
                System.out.println("Enter an odd number.");
                number = scanner.nextInt();
            }
            catch (InputMismatchException ime){
                throw new IllegalArgumentException ("Not a number.", ime);
            }
            finally {
                System.out.println("End of round.");
            }
        }
    }
}
