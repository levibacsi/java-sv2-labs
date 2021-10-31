package localvariables;

public class DistanceMain {
    public static void main (String [] args){
        Distance distance = new Distance (5.43, true);
        System.out.print(distance.getDistance() + " ");
        System.out.println(distance.isExact());

        int distanceWhole = (int) distance.getDistance();

        System.out.println(distanceWhole);
    }
}
