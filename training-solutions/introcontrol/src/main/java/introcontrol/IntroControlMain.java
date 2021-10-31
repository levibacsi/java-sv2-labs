package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();
        System.out.println(introControl.subtractTenIfGreaterThanTen(12));
        System.out.println(introControl.subtractTenIfGreaterThanTen(6));

        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(1));

        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("Jane"));

        System.out.println(introControl.calculateBonus(1234560));
        System.out.println(introControl.calculateBonus(123456));

        System.out.println(introControl.calculateConsumption(2, 9002));
        System.out.println(introControl.calculateConsumption(9999, 0));
        introControl.printNumbers(5);
        System.out.println("");
        introControl.printNumbersBetween(6,9);
        System.out.println("");
        introControl.printNumbersBetween(9,6);
        System.out.println("");
        introControl.printNumbersBetweenAnyDirection(1, 6);
        System.out.println("");
        introControl.printNumbersBetweenAnyDirection(5, 2);
        System.out.println("");
        introControl.printOddNumbers(13);
    }
}
