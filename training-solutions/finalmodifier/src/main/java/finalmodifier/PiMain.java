package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        CircleCalculator circleCalculator = new CircleCalculator();
        System.out.println("Circle perimeter: " + circleCalculator.calculatePerimeter(4.6));
        System.out.println("Circle area: " + circleCalculator.calculateArea(4.6));

        CylinderCalculator cylinderCalculator = new CylinderCalculator();
        System.out.println("Cylinder volume: " + cylinderCalculator.calculateVolume(4.6,5.5));
        System.out.println("Cylinder surface area: " + cylinderCalculator.calculateSurfaceArea(4.6, 5.5));

        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();
        System.out.println("Cylinder 2 volume: " + cylinderCalculatorBasedOnCircle.calculateVolume(4.6, 5.5));
        System.out.println("Cylinder 2 surface area: " + cylinderCalculatorBasedOnCircle.calculateSurfaceArea(4.6, 5.5));

        System.out.println("Pi: " + circleCalculator.PI);
    }
}
