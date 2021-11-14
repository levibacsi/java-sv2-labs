package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCream {
    public static void main(String[] args) {
        List<String> names = new ArrayList(Arrays.asList("eper", "citrom", "puncs"));
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String name: names) {
            if (first) {
                first = false;
            }
            else {
                sb.append(", ");
            }
            sb.append(name);
        }
        System.out.println("Ma kapható: " + sb + ". Gyerekeknek féláron!");
    }

}
