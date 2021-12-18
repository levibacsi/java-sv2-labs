package polymorphism.river;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Danube extends River{
    private List<String> capitals = new ArrayList<>();

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return capitals;
    }

    public static void main(String[] args) {
        Danube danube = new Danube("The Danube", 2000, Arrays.asList("Bécs", "Pozsony", "Budapest", "Belgrád"));
        River river = new Danube("Danube River", 2001, new ArrayList<>());
        Water water = new Danube("Danube water", 2002, new ArrayList<>());

        System.out.println(danube.getName() + " - " + danube.getLength() + " - " + danube.getCapitals());
        System.out.println(river.getName() + " - " + river.getLength());

    }
}
