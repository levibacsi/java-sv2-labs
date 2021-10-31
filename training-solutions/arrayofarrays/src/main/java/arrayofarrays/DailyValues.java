package arrayofarrays;

public class DailyValues {
    public void getValues() {
        int[][] values = new int[12][];
        int [] monthLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < 12; i++) {
            values[i] = new int[monthLength[i]];
        }
        printArrayOfArrays(values);
    }

    private void printArrayOfArrays(int[][] a) {
        for (int i[] : a) {
            for (int j : i) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
        public static void main (String[]args){
            DailyValues dailyValue = new DailyValues();
            dailyValue.getValues();
        }
}

