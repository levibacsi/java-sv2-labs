package dynamictypes.publictransport;

public class Metro extends PublicVehicle{
    private int numberOfTramcars;

    public Metro(int lineNumber, double length, int numberOfTramcars) {
        super(lineNumber, length);
        this.numberOfTramcars = numberOfTramcars;
    }

    public int getNumberOfTramcars() {
        return numberOfTramcars;
    }
}
