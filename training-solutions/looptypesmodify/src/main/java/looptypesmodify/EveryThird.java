package looptypesmodify;

import java.util.Arrays;

public class EveryThird {
    public int[] changeToZero(int[] numbers){
        for (int i = numbers.length -1; i >= 0; i -= 3) {
            numbers[i] = 0;
        }
        return numbers;
    }

    public static void main(String[] args) {
        EveryThird everyThird = new EveryThird();
        int [] numbers = { 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println(Arrays.toString(everyThird.changeToZero(numbers)));
    }
}
