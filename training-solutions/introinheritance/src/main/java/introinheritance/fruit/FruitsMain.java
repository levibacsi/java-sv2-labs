package introinheritance.fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Apple apple = new Apple();
        Grape grape = new Grape();
        GoldenDelicious goldenDelicious = new GoldenDelicious();
        Starking starking = new Starking();

        fruit.setName("Gyümölcs");
        fruit.setWeight(3.45);

        apple.setPieces(12);
        apple.setName("alma");
        apple.setWeight(2.23);

        grape.setType("fehér");
        grape.setName("szőlő");
        grape.setWeight(4.76);

        goldenDelicious.setName("Golden");
        goldenDelicious.setPieces(32);
        goldenDelicious.setWeight(4.21);

        starking.setName("Star");
        starking.setPieces(14);
        starking.setWeight(4.66);

        System.out.println(fruit.getName() + " " + fruit.getWeight());
        System.out.println(apple.getName() + " " + apple.getPieces() + " " + apple.getWeight());
        System.out.println(grape.getName() + " " + grape.getType() + " " + grape.getWeight());
        System.out.println(goldenDelicious.getName() + " " + goldenDelicious.getColour() +" " + goldenDelicious.getPieces()+ " " + goldenDelicious.getWeight() );
        System.out.println(starking.getName() + " " + starking.getColour() + " " + starking.getPieces() + " " + starking.getWeight());
    }
}
