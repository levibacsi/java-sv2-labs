package lambdacollectors.honey;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BeeKeeper {
    private List<Honey> allHoneyProduced;

    public void addHoney (Honey honey){
        allHoneyProduced.add(honey);
    }

    public BeeKeeper(List<Honey> allHoneyProduced) {
        this.allHoneyProduced = allHoneyProduced;
    }

    public int getTotalValueOfGivenGlasses(GlassSize size){
        return allHoneyProduced.stream()
                .filter(honey -> honey.getGlassSize() == size)
                .collect(Collectors.summingInt(honey -> (int) (honey.getHoneyType().getPrice() * size.getKg())));
    }

    public Map<GlassSize, Long> getAmountsOfGivenType(HoneyType type){
        return allHoneyProduced.stream()
                .filter(honey -> honey.getHoneyType() == type)
                .collect(Collectors.groupingBy(Honey::getGlassSize, Collectors.counting()));
    }

    public Map<Boolean, List<Honey>> getGroupsByGivenTypeAndSize(HoneyType type, GlassSize size){
        return allHoneyProduced.stream()
                .collect(Collectors.partitioningBy(honey -> honey.getHoneyType() == type &&
                        honey.getGlassSize() == size));
    }
}
