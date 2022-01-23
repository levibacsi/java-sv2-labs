package lambda;

import java.util.ArrayList;
import java.util.List;

public class TreeNursery {
    private List<Sapling> saplings = new ArrayList<>();

    public TreeNursery(List<Sapling> saplings) {
        this.saplings = saplings;
    }

    public List<Sapling> getSaplings() {
        return saplings;
    }

    public void prune(int maxHeight){
        saplings.forEach(height -> height.cut(maxHeight));
    }
    public void sell(String species, int minHeight){
        saplings.removeIf(sapling -> species.equals(sapling.getSpecies()) && sapling.getHeight() > minHeight);
    }

}
