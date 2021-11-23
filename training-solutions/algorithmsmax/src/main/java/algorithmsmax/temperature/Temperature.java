package algorithmsmax.temperature;

import java.util.List;

public class Temperature {
    public int getMin(List<Integer> temperaturesList){
        int minTemp = temperaturesList.get(0);
        for (Integer temperature: temperaturesList){
            if (temperature < minTemp){
                minTemp = temperature;
            }
        }
        return minTemp;
    }
}
