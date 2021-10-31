package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your favourite band?");
        String band = scanner.nextLine();
        System.out.println("What's their best hit?");
        String title = scanner.nextLine();
        System.out.println("How long does that hit play?");
        int length = scanner.nextInt();
        System.out.println(band + " - " + title + " (" + length + " minutes)");
    }
}
