package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Paper {
    private Map<String, Integer> paper = new HashMap<>();

    public Map<String, Integer> getPaper() {
        return paper;
    }

    public void putFurtherPaper(String className, int kilogramms){
        if (paper.containsKey(className)){
            paper.put(className, paper.get(className) + kilogramms);
        } else {
            paper.put(className, kilogramms);
        }
    }

    public String getWinnerClass(){
        int maxWeight = 0;
        String winner = "";

        for (String className: paper.keySet()){
            if (paper.get(className) > maxWeight){
                maxWeight = paper.get(className);
                winner = className;
            }
        }
        return winner;
    }

    public int getTotalWeight(){
        int totalweight = 0;
        for (int weight: paper.values()){
            totalweight += weight;
        }
        return totalweight;
    }
}
