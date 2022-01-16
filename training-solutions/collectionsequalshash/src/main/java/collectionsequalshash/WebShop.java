package collectionsequalshash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebShop {
    private List<Product> products = new ArrayList<>();

    public WebShop(List<Product> products) {
        this.products = products;
    }

    public int findHowMany(Product product){
        int counter = 0;
        for (Product p: products){
            if (p.equals(product)){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Product tablet = new Product("Great Tablet", 63456345);
        Product phone = new Product("Superb Phone", 12354135);
        Product newTablet = new Product("Great Tablet 2022", 63456345);
        Product newPhone = new Product("Superb Phone", 12354136);

        WebShop webShop = new WebShop(new ArrayList(Arrays.asList(tablet, phone, newTablet, newPhone)));
        System.out.println(webShop.findHowMany(tablet));
        System.out.println(webShop.findHowMany(phone));
    }
}
