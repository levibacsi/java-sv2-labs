package controliteration.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Fibonacci numbers shall I print?");
        int number = scanner.nextInt();

        int first = 1;
        int second = 0;


        if (number == 0){
            System.out.println(second);
        }
        else if (number == 1){
            System.out.println(first);
        }
        else if (number >= 2){
            int count = 1;
            while (count <= number){
                int prev = second;
                second += first;
                first = prev;
                System.out.print (second + " ");
                count++;}
        }
        System.out.println();

        int[] fibonacci = new int[number + 2];
        fibonacci[1] = 1;
        for (int i = 0; i < number; i++) {
            int nextElement = fibonacci[i] + fibonacci[i + 1];
            fibonacci[i + 2] = nextElement;
            System.out.print(fibonacci[i] + ", ");
        }

    }
}
