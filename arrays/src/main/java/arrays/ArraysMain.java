package arrays;

import java.util.Arrays;

public class ArraysMain {
    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size){
        int[][] mltTable = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                mltTable[i][j] = i * j;
            }
        }

        return Arrays.deepToString(mltTable);
    }


    public boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day, anotherDay);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay){
        int min = min(day.length, anotherDay.length);
        double[] rangeOfDay = Arrays.copyOfRange(day, 0, min);
        double[] rangeOfAnotherDay = Arrays.copyOfRange(anotherDay, 0, min);
        return Arrays.equals(rangeOfDay, rangeOfAnotherDay);
    }

    public int min(int lengthOfDay1, int lengthOfDay2){
        return lengthOfDay1 <= lengthOfDay2 ? lengthOfDay1 : lengthOfDay2;
    }

    public boolean wonLottery(int[] chosenNum, int[]winningNum){
        int[] arrayOfChosen = Arrays.copyOf(chosenNum, chosenNum.length);
        int[] arrayOfWinning = Arrays.copyOf(winningNum, winningNum.length);
        Arrays.sort(arrayOfChosen);
        Arrays.sort(arrayOfWinning);
        return Arrays.equals(arrayOfChosen, arrayOfWinning);
    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        int[] chosen = new int[]{4, 72, 33, 67, 80};
        int[] winner = new int[]{4, 33, 67, 72, 80};
        System.out.println(Arrays.toString(chosen));
        System.out.println(Arrays.toString(winner));
        System.out.println("Winner? " + arraysMain.wonLottery(chosen, winner));
    }
}