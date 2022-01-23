package lambdacollectors.christmastree;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ChristmasTreeFair {
    private List<ChristmasTree> christmasTrees;

    public ChristmasTreeFair(List<ChristmasTree> christmasTrees) {
        this.christmasTrees = christmasTrees;
    }

    public Map<PineTreeType, Long> getCountByType(){
        return christmasTrees.stream()
                .collect(Collectors.groupingBy(ChristmasTree::getType, Collectors.counting()));

    }

    public double getMaxHeightByType(PineTreeType type){
        OptionalDouble maxHeightByType = christmasTrees.stream()
                .filter(t -> t.getType().equals(type))
                .mapToDouble(ChristmasTree::getHeight)
                .max();
        if (maxHeightByType.isPresent()) {
            return maxHeightByType.getAsDouble();
        }
        return 0;
    }

  // public double getAveragePrice(){
  //     OptionalDouble avg = christmasTrees.stream()
  //             .mapToDouble(t -> t.getType().getPricePerMeter() * t.getHeight())
  //             .average();
  //     if (avg.isPresent()){
  //         return avg.getAsDouble();
  //     }
  //     return 0;
  // }

    public double getAveragePrice() {
        return christmasTrees.stream()
                .collect(Collectors.averagingInt(tree -> (int) (tree.getType().getPricePerMeter() * tree.getHeight())));
    }
}
