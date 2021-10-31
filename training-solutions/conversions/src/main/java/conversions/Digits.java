package conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static javax.swing.UIManager.get;

public class Digits {
    private List<Integer> numbers = new ArrayList<>();

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void addDigitsToList(String text){
        char [] enteredText = text.toCharArray();
        for (char c : enteredText) {
            if (Character.isDigit(c)) {
                String digits = Character.toString(c);
                int number = Integer.parseInt(digits);
                numbers.add(number);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Digits digits = new Digits();
        System.out.println("Enter anything");
        String text = scanner.nextLine();
        digits.addDigitsToList(text);
        System.out.println(digits.getNumbers());

    }
}
