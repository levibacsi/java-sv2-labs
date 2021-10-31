package chars;

import java.util.Scanner;

public class Words {
    public String pushWord(String word){
    char [] characters = word.toCharArray();
    for (int i = 0; i < characters.length; i++){
        characters[i] ++;
        }
    String newWord = new String(characters);
    return newWord;
    }

    public static void main(String[] args) {
        Words words = new Words();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String entered = scanner.nextLine();

        System.out.println(words.pushWord(entered));
    }
}
