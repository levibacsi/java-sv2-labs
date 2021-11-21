package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of birthdays to record?");
        int bDaysNumber = 0;
        try {
            bDaysNumber = scanner.nextInt();
            scanner.nextLine();
        }
        catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Not a number", nfe);
        }
        List<String> bDayList = new ArrayList<>();

        for (int i = 0; i < bDaysNumber; i++){
            System.out.println("Name of " + (i+1) + ". person?");
            String name = scanner.nextLine();
            System.out.println("Birthday of " + (i+1) + ". person?");
            String birthDay = scanner.nextLine();
            bDayList.add(name + " - " + birthDay);
        }
        try {
            Files.write(Paths.get("birthdaylist.txt"), bDayList);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("File written");
    }
}
