package collectionscomp;

import java.util.TreeSet;

public class Building implements Comparable<Building>{
    private  String title;
    private int area;
    private Integer floors;

    public Building(String title, int area, int floors) {
        this.title = title;
        this.area = area;
        this.floors = floors;
    }

    @Override
    public int compareTo(Building building) {
        return floors.compareTo(building.floors);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Building building = (Building) o;

        return floors == building.floors;
    }

    @Override
    public int hashCode() {
        return floors;
    }

    @Override
    public String toString() {
        return "Building{" +
                "title='" + title + '\'' +
                ", area=" + area +
                ", floors=" + floors +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public double getArea() {
        return area;
    }

    public int getFloors() {
        return floors;
    }

    public static void main(String[] args) {
        TreeSet<Building> buildings = new TreeSet<>();
        buildings.add(new Building("House", 200, 2));
        buildings.add(new Building("Bungalow", 60, 1));
        buildings.add(new Building("Cottage", 100, 1));

        System.out.println(buildings);
    }
}
