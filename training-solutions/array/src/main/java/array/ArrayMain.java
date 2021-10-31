package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days[1]);
        System.out.println(days.length);

        int[] twoSquare = new int [5];
        twoSquare[0] = 1;
        for (int i = 1; i < twoSquare.length; i++) {
            twoSquare[i] = twoSquare[i - 1] * 2;
        }

        for (int i = 0; i < twoSquare.length; i++){
            System.out.print(twoSquare[i] + " ");
        }

        System.out.println();

        boolean[] boo = new boolean[6];
        for (int i = 1; i < boo.length; i++) {
            boo[i] = !boo[i - 1];
        }

        for (int i = 0; i < boo.length; i++){
            System.out.print(boo[i] + " ");
        }
    }
}
