package algorithmsmax.hill;

import java.util.List;

public class Hill {
    public int getMax(List<Integer> heightsList){
        int maxHeight = heightsList.get(0);
        for (Integer height: heightsList){
            if (height > maxHeight){
                maxHeight = height;
            }
        }
        return maxHeight;
    }
}
