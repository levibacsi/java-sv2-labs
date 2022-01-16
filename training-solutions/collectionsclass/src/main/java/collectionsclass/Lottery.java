package collectionsclass;

import java.util.*;

public class Lottery{
    Random random = new Random();

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount){
        if (lotteryType >= ballCount){
            throw new IllegalArgumentException ("There must be more balls than the winning numbers!");
        }

    List<Integer> drawnNumbers = new ArrayList<>();
    while (drawnNumbers.size() < lotteryType){
        int number = (random.nextInt(1, ballCount +1));
        if (!drawnNumbers.contains(number)) {
            drawnNumbers.add(number);
        }
    }
    Collections.sort(drawnNumbers);

     return drawnNumbers;
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println(lottery.selectWinningNumbers(5, 90));
    }
}
