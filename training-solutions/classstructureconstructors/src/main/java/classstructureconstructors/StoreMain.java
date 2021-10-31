package classstructureconstructors;
import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = new Store("PCs");
        System.out.println("Incoming " + store.getProduct() + "?");
        int incoming = scanner.nextInt();
        store.store(incoming);
        System.out.println("Stock: " + store.getStock() + " " + store.getProduct());
        System.out.println("Dispatched " + store.getProduct() + "?");
        int outgoing = scanner.nextInt();
        store.dispatch(outgoing);
        System.out.println("Stock: " + store.getStock() + " " + store.getProduct());
    }
}
