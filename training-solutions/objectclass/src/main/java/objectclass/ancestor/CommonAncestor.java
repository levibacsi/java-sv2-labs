package objectclass.ancestor;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();

        Fruit fruit = new Fruit();
        objectList.add(fruit);

        Apple apple = new Apple();
        objectList.add(apple);

        Starking starking = new Starking();
        objectList.add(starking);

        Vegetable vegetable = new Vegetable();
        objectList.add(vegetable);

        objectList.add("alma");
        objectList.add(12);
        objectList.add('x');

        LocalDate localDate = LocalDate.now();
        objectList.add(localDate);

        int[] array = {1, 2, 6, 89};
        objectList.add(array);

        List<String> stringList = Arrays.asList("first", "second", "third");
        objectList.add(stringList);

        System.out.println(objectList);
    }
}
