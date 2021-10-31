package numbers;

import java.util.Scanner;

public class Percent {
    public double getValue(int number, int percent){
        return (double) number * percent/100;
    }

    public double getBase(int number, int percent) {
        return 100.0 * number / percent;
    }

    public double getPercent(int numberOne, int numberTwo){
            return 100.0 * numberTwo / numberOne;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number 1?");
        int number = scanner.nextInt();
        System.out.println("Percent?");
        int perc = scanner.nextInt();
        System.out.println("Result: " + percent.getValue(number, perc));

        System.out.println();
        System.out.println("Number 2?");
        int number2 = scanner.nextInt();
        System.out.println("Number 3?");
        int number3 = scanner.nextInt();
        System.out.println(number2 + " is " + number3 + " percent of "+ percent.getBase(number2, number3));
        System.out.println("Number 4?");
        int number4 = scanner.nextInt();
        System.out.println("Number 5?");
        int number5 = scanner.nextInt();
        System.out.println(number4 + " is " + percent.getPercent(number4, number5) + " percent of " + number5);
    }
}
