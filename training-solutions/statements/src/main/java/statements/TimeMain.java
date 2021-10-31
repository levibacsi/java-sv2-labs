package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("First hour?");
        int hourPrev = scanner.nextInt();
        System.out.println("First minute?");
        int minutePrev = scanner.nextInt();
        System.out.println("First second?");
        int secondPrev = scanner.nextInt();
        System.out.println("Second hour?");
        int hourNext = scanner.nextInt();
        System.out.println("Second minute?");
        int minuteNext = scanner.nextInt();
        System.out.println("Second second?");
        int secondNext = scanner.nextInt();

        Time timePrev = new Time (hourPrev, minutePrev, secondPrev);
        Time timeNext = new Time (hourNext, minuteNext, secondNext);

        System.out.println("First time is: " + timePrev.toString() + " = " + timePrev.getInMinutes() + " minutes");
        System.out.println("Second time is: " + timeNext.toString() + " = " + timeNext.getInSeconds() + " seconds");
        System.out.println("The first one earlier than the second one: " + timePrev.earlierThan(timeNext));
    }
}