package mathproblems;

import java.util.Scanner;

public class Division {
    public void getDivisors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(number + " osztója: " + i);
            }
        }
    }

    public void getRightNumbers(int[] numbers){
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] % i == 0){
                System.out.print(numbers[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Division division = new Division();
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        division.getDivisors(number);
        System.out.println();

        int[] numbers = {2, 5, 23, 56, -36, 45, 78, 14, -8, 4, 10};
        division.getRightNumbers(numbers);
    }


}
