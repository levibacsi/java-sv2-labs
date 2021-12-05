package dynamictypes.publictransport;

public class Bus extends PublicVehicle{

    private String brand;

    public Bus(int lineNumber, double length, String brand) {
        super(lineNumber, length);
        this.brand = brand;
    }

    public Bus(int lineNumber, double length) {
        super(lineNumber, length);
    }

    public String getBrand() {
        return brand;
    }
}
