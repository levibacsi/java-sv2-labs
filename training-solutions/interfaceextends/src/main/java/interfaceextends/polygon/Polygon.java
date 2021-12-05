package interfaceextends.polygon;

public class Polygon implements Geometric{
    private double lengthOfSide;
    private int numberOfVertices;

    public Polygon(double lengthOfSide, int numberOfVertices) {
        this.lengthOfSide = lengthOfSide;
        this.numberOfVertices = numberOfVertices;
    }

    public double getLengthOfSide() {
        return lengthOfSide;
    }

    public int getNumberOfVertices() {
        return numberOfVertices;
    }

    @Override
    public double getPerimeter() {
        return lengthOfSide * numberOfVertices;
    }

    @Override
    public int getNumberOfDiagonalsFromOneVertex() {
        if (numberOfVertices > 2){
            return numberOfVertices - 3;
        } else return 0;
    }

    @Override
    public int getNumberOfAllDiagonals() {
        return getNumberOfDiagonalsFromOneVertex() * numberOfVertices / 2;
    }
}
