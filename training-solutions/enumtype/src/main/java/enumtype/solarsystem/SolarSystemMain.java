package enumtype.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {

        System.out.println(SolarSystem.MERCURY);
        System.out.println(SolarSystem.MERCURY.getMoon());

        System.out.println(SolarSystem.MARS);
        System.out.println(SolarSystem.MARS.getMoon());

        System.out.println(SolarSystem.JUPITER);
        System.out.println(SolarSystem.JUPITER.getMoon());
    }
}
