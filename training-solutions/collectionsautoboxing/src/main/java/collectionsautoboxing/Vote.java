package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {
    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> votingResult){
        Map<VoteResult, Integer> sums = new HashMap<>();

        for (VoteResult result: votingResult.values()){
            if (!sums.containsKey(result)){
                sums.put(result, 0);
            }
            sums.put(result, sums.get(result) +1);
        }
        return sums;
    }
}
