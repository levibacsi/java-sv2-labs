package introcontrol;
import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        System.out.println("Enter an integer");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num > 100 ? "Nagyobb, mint száz" : "Száz vagy kisebb");
    }
}
