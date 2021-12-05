package inheritanceattributes;

public class Building {
    protected String name;
    protected double area;
    private int floors;

    public Building(String name, double area, int floors) {
        this.name = name;
        this.area = area;
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", floors=" + floors +
                '}';
    }
}
