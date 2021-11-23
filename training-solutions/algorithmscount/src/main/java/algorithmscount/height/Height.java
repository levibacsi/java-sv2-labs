package algorithmscount.height;

import java.util.List;

public class Height {
    public int countChildrenWithHeightGreaterThan(List<Integer> heightsList, int limit){
        int counter = 0;
        for (Integer h: heightsList){
            if (h >= limit){
                counter++;
            }
        }
        return counter;
    }
}
