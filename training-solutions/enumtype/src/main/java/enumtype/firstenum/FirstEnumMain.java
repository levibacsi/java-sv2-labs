package enumtype.firstenum;

import java.util.AbstractMap;
import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {

    System.out.println(Continent.AFRICA);
    System.out.println(Continent.AMERICA);
    System.out.println(Continent.ASIA);
    System.out.println(Continent.AUSTRALIA);
    System.out.println(Continent.EUROPE);

    System.out.println(Arrays.toString(Continent.values()));

    Ocean atlantic = Ocean.valueOf("ATLANTIC");
        System.out.println(atlantic);
    Ocean indian = Ocean.valueOf("INDIAN");
        System.out.println(indian);
    Ocean pacific = Ocean.valueOf("PACIFIC");
        System.out.println(pacific);

        System.out.println(Football.GOALKEEPER);
        System.out.println(Football.DEFENDER.name());
        System.out.println(Football.MIDFIELDER.name());
        System.out.println(Football.STRIKER.name());


    }
}
