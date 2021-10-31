package chars;

import java.util.Scanner;

public class LettersAndDigits {
    public void printLetterOrDigit(String text){
        for (char c: text.toCharArray()){
            if (Character.isLetter(c)){
                System.out.println(c + ": a letter");
                }
            else if (Character.isDigit(c)) {
                System.out.println(c + ": a number");
            } else {
                System.out.println(c + ": other");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LettersAndDigits lad = new LettersAndDigits();

        System.out.println("Enter whatever");
        String chars = scanner.nextLine();
        lad.printLetterOrDigit(chars);


    }
}
