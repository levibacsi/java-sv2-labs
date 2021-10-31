package conversions;

import java.util.Scanner;

public class TooBigNumber {
    public long getRightResult(int number){
        return (long) 2_147_483_647 + number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TooBigNumber tooBigNumber = new TooBigNumber();
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println(tooBigNumber.getRightResult(number));
    }
}
