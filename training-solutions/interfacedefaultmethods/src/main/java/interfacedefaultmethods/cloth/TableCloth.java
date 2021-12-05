package interfacedefaultmethods.cloth;

public class TableCloth implements Square{
    private double side;

    public TableCloth(double side) {
        this.side = side;
    }

    @Override
    public double getSide() {
        return side;
    }

    @Override
    public int getNumberOfSides() {
        return Square.super.getNumberOfSides();
    }

    @Override
    public double getLengthOfDiagonal() {
        return Square.super.getLengthOfDiagonal();
    }

    @Override
    public double getPerimeter() {
        return Square.super.getPerimeter();
    }

    @Override
    public double getArea() {
        return Square.super.getArea();
    }
}
