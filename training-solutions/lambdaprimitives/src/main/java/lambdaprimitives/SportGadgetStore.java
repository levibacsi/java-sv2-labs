package lambdaprimitives;

import java.util.*;

public class SportGadgetStore {
    private List<Product> products;

    public SportGadgetStore(List<Product> products) {
        this.products = products;
    }

    public int getNumberOfProducts(){
        return products.stream()
                .mapToInt(Product::getPiece)
                .sum();
    }

    public double getAveragePrice(){

        OptionalDouble avg = products.stream()
                .mapToDouble(Product::getPrice)
                .average();
        if (avg.isPresent()){
            return avg.getAsDouble();
        }
        return 0;
    }

    public String getExpensiveProductStatistics(double minPrice) {
        IntSummaryStatistics stat = products.stream()
                .filter(p -> p.getPrice() > minPrice)
                .mapToInt(Product::getPiece)
                .summaryStatistics();
        if (stat.getCount() > 0) {
            return "Összesen " + stat.getCount() + " féle termék, amelyekből minimum " + stat.getMin() + " db, maximum " +
                    stat.getMax() + " db, összesen " + stat.getSum() + " db van.";
        }
        return "Nincs ilyen termék.";
    }
}