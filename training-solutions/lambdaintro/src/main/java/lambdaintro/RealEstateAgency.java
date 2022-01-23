package lambdaintro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RealEstateAgency {
    private List<Flat> flatsToSell = new ArrayList<>();

    public RealEstateAgency(List<Flat> flatsToSell) {
        this.flatsToSell = flatsToSell;
    }

    private Flat findFirst(Predicate<Flat> condition){
        for (Flat flat: flatsToSell){
            if (condition.test(flat)){
                return flat;
            }
        }
        throw new IllegalArgumentException("No such flat.");
    }

    public Flat findFirstCheaperFlat(int maxPrice){
        return findFirst(flat -> flat.getPrice() < maxPrice);
    }

    public Flat findFirstGreaterFlat(double minArea){
        return findFirst(flat -> flat.getArea() > minArea);
    }

    public Flat findFirstFlatInSameTown(String town){
        return findFirst(flat -> flat.getAddress().contains(town));
    }
}
