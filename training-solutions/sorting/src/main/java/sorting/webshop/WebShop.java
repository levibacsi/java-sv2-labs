package sorting.webshop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WebShop {
    private List<Product> products = new ArrayList<>();

    public void addProducts(Product product){
        products.add(product);
    }

    public List<Product> getProductsOrderByName(){
        List<Product> productsOrderByName = new ArrayList<>(products);
        productsOrderByName.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return productsOrderByName;
    }
    public List<Product> getProductsOrderByPrice(){
        List<Product> productsOrderByPrice = new ArrayList<>(products);
        productsOrderByPrice.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
        });
        return productsOrderByPrice;
    }

    public List<Product> getProductsOrderByDate(){
        List<Product> productsOrderByDate = new ArrayList<>(products);
        productsOrderByDate.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getFrom().compareTo(o2.getFrom());
            }
        });
        return productsOrderByDate;
    }
}
