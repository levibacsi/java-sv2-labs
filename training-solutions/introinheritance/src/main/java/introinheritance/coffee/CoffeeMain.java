package introinheritance.coffee;

public class CoffeeMain {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Java");
        coffee.setPrice(100);

        System.out.println(coffee);

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Cap");
        cappuccino.setPrice(99);

        System.out.println(cappuccino);
    }
}
