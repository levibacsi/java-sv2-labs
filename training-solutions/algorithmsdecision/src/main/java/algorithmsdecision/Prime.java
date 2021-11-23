package algorithmsdecision;

public class Prime {
    public boolean isPrime(int number) {
        boolean result = true;
        if (number < 2){
            result = false;
        } else
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    result = false;
                }
            }
        return result;
    }
}