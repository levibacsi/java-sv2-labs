package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> frozen = new ArrayList<>();
        frozen.add("poultry");
        frozen.add("bread");
        frozen.add("nuggets");
        frozen.add("pie");
        frozen.add("veggies");

        System.out.println(frozen);
        System.out.println(frozen.size());

        frozen.remove("bread");
        frozen.remove(1);

        System.out.println(frozen);
        System.out.println(frozen.size());

    }
}
