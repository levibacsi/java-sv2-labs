package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word not longer than 5 letters");
        String word = scanner.nextLine();

        if (word.length() > 5 ){
            throw new IllegalArgumentException("Longer than 5 letters");
        }

        char[] wordArray = word.toCharArray();
        for (char character: wordArray){
            if (!Character.isAlphabetic(character)) {
                throw new IllegalArgumentException("Contains other than letters");
            }
        }
        System.out.println("You entered: " + word);
    }
}
