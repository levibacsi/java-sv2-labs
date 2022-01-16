package collectionsmap;

import java.util.Map;

public class Casting {
    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants){
        int smallestDiff = Integer.MAX_VALUE;
        for (Integer i: applicants.keySet()){
            if (i - lastNumber >= 0 && i - lastNumber < smallestDiff){
                smallestDiff = i;
            }
        }
        return applicants.get(smallestDiff);
    }
}
