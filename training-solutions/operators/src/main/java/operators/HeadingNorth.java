package operators;

public class HeadingNorth {
    public int getNumberOfNewDirections(){

        int degree = 0;
        int count = 0;
        for (int i = 10; degree <360; i +=10){
            degree += i;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        HeadingNorth headingNorth = new HeadingNorth();
        System.out.println(headingNorth.getNumberOfNewDirections());
    }
}
