package inheritanceattributes;

public class BuildingMain {
    public static void main(String[] args) {
        Building building = new Building("House", 345.67, 2);
        SchoolBuilding schoolBuilding = new SchoolBuilding("School", 1234, 3, 6);

        System.out.println(building);
        System.out.println(schoolBuilding);
    }
}
