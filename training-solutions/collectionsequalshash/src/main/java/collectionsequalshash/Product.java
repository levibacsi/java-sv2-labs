package collectionsequalshash;

public class Product {
    private String name;
    private int regNum;

    public Product(String name, int regNum) {
        this.name = name;
        this.regNum = regNum;
    }

    public String getName() {
        return name;
    }

    public int getRegNum() {
        return regNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return regNum == product.regNum;
    }

    @Override
    public int hashCode() {
        return regNum;
    }
}
