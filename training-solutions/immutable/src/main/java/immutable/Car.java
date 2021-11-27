package immutable;

public class Car {
    private final String brand;
    private final String model;
    private final int yearOfProduction;

    public Car(String brand, String model, int yearOfProduction) {
        if (brand == null || "".equals(brand)) {
            throw new IllegalArgumentException("Brand name cannot be empty!");
        }

        if (yearOfProduction > 2021){
            throw new IllegalArgumentException("Year of production cannot be in the future!");
        }

        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
