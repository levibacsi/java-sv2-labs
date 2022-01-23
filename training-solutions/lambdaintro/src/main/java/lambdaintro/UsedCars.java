package lambdaintro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsedCars {
    private List<Car> usedCars = new ArrayList<>();

    public UsedCars(List<Car> usedCars) {
        this.usedCars = usedCars;
    }

    public List<Car> getUsedCars() {
        return usedCars;
    }

    public void addCar (Car car){
        usedCars.add(car);
    }

    public List<Car> listCarsByPrice(){
        List<Car> carsByPrice = new ArrayList<>(usedCars);
        carsByPrice.sort((car1, car2) -> Integer.compare(car1.getPrice(), car2.getPrice()));
        return carsByPrice;
    }

    public List<Car> listCarsByLengthDesc(){
        List<Car> carsByLength = new ArrayList<>(usedCars);
        carsByLength.sort((car1, car2) -> Double.compare(car1.getLength(), car2.getLength()));
        Collections.reverse(carsByLength);
        return carsByLength;
    }

    public List<Car> listCarsOneBrandByType(String brand){
        List<Car> carsByBrand = new ArrayList<>(usedCars);
        carsByBrand.removeIf(car -> !car.getBrand().equals(brand));
        carsByBrand.sort((car1, car2) -> car1.getType().compareTo(car2.getType()));
        return carsByBrand;
    }
}
