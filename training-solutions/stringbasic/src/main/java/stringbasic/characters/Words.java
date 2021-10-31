package stringbasic.characters;

import java.util.Arrays;
import java.util.Scanner;

public class Words {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a word");
            String word = scanner.nextLine();
            System.out.println();

            System.out.println("Spell this word: " + word);

            char[] chars = new char[word.length()];

            for (int i = 0; i < word.length(); i++) {
                String letter = scanner.nextLine();
                chars[i] = letter.toCharArray()[0];
            }

            System.out.println("Letters entered: " + Arrays.toString(chars));
            String result = new String(chars);
            System.out.println("The word: " + result);

            if (result.equals(word)) {
                System.out.println("Well done.");
            } else {
                System.out.println("Incorrect.");
            }
        }
}
