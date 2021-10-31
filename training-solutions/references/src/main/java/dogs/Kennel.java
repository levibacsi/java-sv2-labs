package dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();

        Dog dog1 = new Dog("Chow", 3, "brown");
        Dog dog2 = new Dog("Bark", 4, "white");
        Dog dog3 = new Dog("Woof", 2, "black");

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        System.out.println(dogs.toString());

        Dog dog4 = dogs.get(1);
        dog4.setColour("gray");

        System.out.println(dogs.toString());

        Dog dog5 = new Dog("Phew", 10, "beige");

        System.out.println(dog5);

        dog5 = dogs.get(1);

        System.out.println(dog5);

        dogs.add(dog5);

        System.out.println(dogs.toString());

        Dog dog6 = new Dog("Thrasher", 7, "striped");
        dog6 = dog4;
        dog6.setColour("dotted");

        System.out.println(dogs.toString());

        List<Dog> otherDogs = new ArrayList<>();
        otherDogs = dogs;

        Dog dog7 = new Dog("Pinky", 6, "pink");

        dog7 = dog4;

        dog7.setColour("green");

        System.out.println(otherDogs.toString());

        dog2.setColour("blue");
        System.out.println(otherDogs.toString());

        dog2 = null;

        System.out.println(otherDogs);

        Dog dog8 = dogs.get(1);
        dog8 = null;

        System.out.println(otherDogs);

        Dog dog9 = dogs.get(1);
        dog9.setColour("rainbow");

        System.out.println(otherDogs);






    }
}
