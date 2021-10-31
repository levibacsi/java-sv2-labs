package classstructureintegrate;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product("Chairs", 10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("The price of " + product.getName() + " is currently " + product.getPrice());
        System.out.println("How much shall the price of " + product.getName() + " be increased?");
        int amountIncrease = scanner.nextInt();
        product.increasePrice(amountIncrease);
        System.out.println("Price of " + product.getName() + ": " + product.getPrice());
        System.out.println("How much shall the price of " + product.getName() + " be decreased?");
        amountIncrease = scanner.nextInt();
        product.decreasePrice(amountIncrease);
        System.out.println("Price of " + product.getName() + ": " + product.getPrice());
    }
}
