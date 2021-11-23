package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> inhabitantList, int limit){
        for (Integer i: inhabitantList){
            if (i < limit){
                return true;
            }
        }
        return false;
    }
}
