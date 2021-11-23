package recursion;

import java.util.Arrays;

public class Numbers {
    public int getSum(int[] numbers) {
        int n = numbers.length;
        if (n > 1) {
            int[] result = Arrays.copyOfRange(numbers, 1, n);
            return numbers[0] + getSum(result);
        } else if (n == 1) {
            return numbers[0];
        }
        return 0;
    }
}