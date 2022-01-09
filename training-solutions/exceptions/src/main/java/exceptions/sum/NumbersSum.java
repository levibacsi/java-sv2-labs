package exceptions.sum;

public class NumbersSum {
    public int getSum(int[] numbers){
        if (numbers == null){
            throw new IllegalArgumentException ("Numbers must not be empty");
        }
        int sum = 0;
        for (int i: numbers){
            sum += i;
        }
        return sum;
    }

    public int getSum(String[] numbers){
        if (numbers == null){
            throw new IllegalArgumentException ("Numbers must not be empty");
        }

        int [] numbersFromString = new int[numbers.length];
        try {
        for (int i = 0; i < numbers.length; i++) {
            numbersFromString[i] = Integer.parseInt(numbers[i]);
        }
        }
        catch (NumberFormatException nfe){
            throw new IllegalArgumentException("Illegal numbers");
        }
        return getSum(numbersFromString);
    }
}
