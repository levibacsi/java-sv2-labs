package sorting;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    private List<Car> carsForSale = new ArrayList<>();

    public void addCar(Car car){
        carsForSale.add(car);
    }

    public List<Car> getCarsOrderedByYearOfConstruction(){
        List<Car> carsOrderedByYearOfConstruction = new ArrayList (carsForSale);
        carsOrderedByYearOfConstruction.sort(new CarConstructionComparator());
        return carsOrderedByYearOfConstruction;
    }

    public List<Car> getCarsOrderedByPrice(){
        List<Car> carsOrderedByPrice = new ArrayList<>(carsForSale);
        carsOrderedByPrice.sort(new CarPriceComparator());
        return carsOrderedByPrice;
    }
}
