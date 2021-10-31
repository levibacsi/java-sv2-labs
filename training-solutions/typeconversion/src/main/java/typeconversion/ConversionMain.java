package typeconversion;

import java.util.Arrays;
import java.util.Scanner;

public class ConversionMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversion conversion = new Conversion();

        System.out.println("Enter a double");
        double number = scanner.nextDouble();
        System.out.println(conversion.convertDoubleToDouble(number));

        int [] numbers = {12, 23, 0, 128, -1, 127};
        System.out.println(Arrays.toString(conversion.convertIntArrayToByteArray(numbers)));

        System.out.println("Enter another double");
        double dbl = scanner.nextDouble();
        System.out.println(conversion.getFirstDecimal(dbl));
    }


}
