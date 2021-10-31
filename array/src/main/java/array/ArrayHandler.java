package array;

public class ArrayHandler {
    void addIndexToNumber(int[] source){
        for (int i = 0; i < source.length; i++){
            source[i] += i;
        }
    }

    void concatenateIndexToWord(String[] source){
        for (int i = 0; i < source.length; i++){
            source[i] = i + source[i];
        }
    }

    public static void main(String[] args) {
        int[] integers = new int [8];
        integers[0] = 1;
        for (int i = 1; i < integers.length; i++) {
            integers[i] = integers[i-1]+2;
        }

        String[] words = {"apple", "peach", "plum", "orange"};

        for (int i : integers) {
            System.out.println(i);
        };

        for (int i : integers) {
            System.out.print(i + ", ");
        }
        System.out.println();

        for (String w : words) {
            System.out.println(w);
        };
        for (String w : words) {
            System.out.print(w + ", ");
        };
        System.out.println();
    }
}

