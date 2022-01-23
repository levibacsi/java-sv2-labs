package lambda;

import java.util.ArrayList;
import java.util.List;

public class Remainder {
    public List<Integer> changeNumbersToRemainders_for(List<Integer> numbers, int divisor){
        List<Integer> remainders = new ArrayList<>();
        for (int i: numbers){
            remainders.add(i % divisor);
        }
        return remainders;
    }

    public List<Integer> changeNumbersToRemainders(List<Integer> numbers, int divisor){
        numbers.replaceAll(number -> number % divisor);
        return numbers;
    }
}
