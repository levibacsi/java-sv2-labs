package classstructureconstructors;

public class Store {
    private String product;
    private int stock;
    private int incoming;
    private int outgoing;

    public Store(String product) {
        this.product = product;
        stock = 0;
    }

    public void store(int incoming){
        stock = stock + incoming;
    }
    public void dispatch(int outgoing){
        stock = stock - outgoing;
    }

    public int getStock() {
        return stock;
    }
    public String getProduct() {
        return product;
    }
}

