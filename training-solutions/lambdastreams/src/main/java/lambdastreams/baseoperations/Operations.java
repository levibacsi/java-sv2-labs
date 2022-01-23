package lambdastreams.baseoperations;

import java.util.*;
import java.util.stream.Collectors;

public class Operations {
    private List<Integer> numbers = new ArrayList<>();

    public Operations(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public Optional<Integer> min(){
        return numbers.stream()
                .min(Comparator.comparingInt(Integer::intValue));
    }

    public Integer sum(){
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public boolean isAllPositive(){
        return numbers.stream().allMatch(n -> n > 0);
    }

    public Set<Integer> getDistinctElements(){
        return numbers.stream().collect(Collectors.toSet());
    }


}
