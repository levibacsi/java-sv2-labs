package arrayofarrays;

public class Rectangle {
    public void rectangularMatrix(int size1, int size2) {
        int[][] rectangularMatrix = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                rectangularMatrix[i][j] = i;
                System.out.print(rectangularMatrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.rectangularMatrix(3, 7);
    }
}
