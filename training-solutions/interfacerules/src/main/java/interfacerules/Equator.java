package interfacerules;

public class Equator implements Name, Length {
    private static final String NAME = "Equator";
    private static final double LENGTH = 40075.017;

    @Override
    public double getLength() {
        return LENGTH;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
