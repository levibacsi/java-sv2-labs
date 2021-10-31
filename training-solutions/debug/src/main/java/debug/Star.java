package debug;

public class Star {
    public void writeStars(int[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            int prev = numbers[i];
            int stars = numbers[i+1] - prev;
            printStars(stars);

            System.out.println("");
        }
    }

    private void printStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Star star = new Star();
        int[] anArray = {1, 3, 5, 10, 12};
        System.out.println("*");
        star.writeStars(anArray);
    }
}

