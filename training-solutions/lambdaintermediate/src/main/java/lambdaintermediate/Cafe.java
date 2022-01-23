package lambdaintermediate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cafe {
    private List<CoffeeOrder> orders = new ArrayList<>();

    public Cafe(List<CoffeeOrder> orders) {
        this.orders = orders;
    }

    public void addOrder (CoffeeOrder coffeeOrder){
        orders.add(coffeeOrder);
    }

    public Integer getTotalIncome(){
        return orders.stream().flatMapToInt(cl -> cl.getCoffees().stream()
                .mapToInt(Coffee::getPrice))
                .sum();
    }

    public Integer getTotalIncome(LocalDate date){
        return orders.stream()
                .filter(o -> o.getDateTime().toLocalDate().equals(date))
                .flatMapToInt(c -> c.getCoffees().stream()
                .mapToInt(Coffee::getPrice))
                .sum();
    }

    public long getNumberOfCoffee(CoffeeType type){
        return orders.stream().flatMap(cl -> cl.getCoffees().stream())
                .filter(coffee -> coffee.getType().equals(type))
                .count();
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDateTime from){
        return orders.stream()
                .filter(o -> o.getDateTime().isAfter(from))
                .toList();
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date){
        return orders.stream()
                .filter(o -> o.getDateTime().toLocalDate().equals(date))
                .sorted(Comparator.comparing(CoffeeOrder::getDateTime))
                .limit(5)
                .toList();
    }
}
