package lambdaprimitives;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Truck {
    private List<Cargo> thingsToLoad;

    public Truck(List<Cargo> thingsToLoad) {
        this.thingsToLoad = thingsToLoad;
    }

    public double getShortestLength(){
        if (thingsToLoad.isEmpty()){
            return 0;
        }
        OptionalDouble minLength = thingsToLoad.stream()
                .mapToDouble(Cargo::getLength)
                .min();
        return minLength.getAsDouble();
    }

    public int getTotalWeight(){
        return thingsToLoad.stream()
                .mapToInt(Cargo::getWeight)
                .sum();
    }

    public double getAverageWeight(){
        return thingsToLoad.stream()
                .mapToInt(Cargo::getWeight)
                .average()
                .orElseThrow(() -> new IllegalArgumentException ("No cargo."));
    }

    public int getMaxWeight(){
        if (thingsToLoad.isEmpty()){
            return 0;
        }
        OptionalInt maxWeight = thingsToLoad.stream()
                .mapToInt(Cargo::getWeight)
                .max();
        return maxWeight.getAsInt();
    }

    public String getWeightStatistics(){
        if (thingsToLoad.isEmpty()){
            return "No cargo.";
        }
        IntSummaryStatistics stat = thingsToLoad.stream()
                .mapToInt(Cargo::getWeight)
                .summaryStatistics();
//        return "A rakományban található " +stat.getCount()+ " tétel, melyeknek összsúlya " +stat.getSum()+
//                " kg, közülük a legnehezebb " +stat.getMax()+ " kg, a legkönnyebb " +stat.getMin()+
//                " kg. A súlyuk átlagosan "+ stat.getAverage() +" kg.";
        return String.format("A rakományban található %d tétel, melyeknek összsúlya %d kg, közülük a legnehezebb " +
                        "%d kg, a legkönnyebb %d kg. A súlyuk átlagosan %.1f kg.",
                stat.getCount(), stat.getSum(), stat.getMax(), stat.getMin(), stat.getAverage());
    }
}
