package collectionsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {
    private List<ChristmasPresent> presents = new ArrayList<>();

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = presents;
    }

    public void addNewPresent(ChristmasPresent present){
        presents.add(present);
    }

    public List<ChristmasPresent> getPresents() {
        return presents;
    }

    public void removeTooExpensivePresent(int maxPrice){
        presents.removeIf(next -> next.getPrice() > maxPrice);
    }

    public void removeTooExpensivePresentIterator(int maxPrice){
        for (Iterator<ChristmasPresent> present = presents.iterator(); present.hasNext();){
            ChristmasPresent next = present.next();
            if (next.getPrice() > maxPrice){
                present.remove();
            }
        }
    }
}
