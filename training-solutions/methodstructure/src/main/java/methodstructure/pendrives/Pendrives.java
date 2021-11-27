package methodstructure.pendrives;

import java.util.List;

public class Pendrives {
    public Pendrive getBest(List<Pendrive> penDriveList){
        Pendrive bestPD = penDriveList.get(0);
        for (Pendrive pd: penDriveList){
            if (pd.comparePricePerCapacity(bestPD) == -1){
                bestPD = pd;
            }
        }
        return bestPD;
    }

    public Pendrive getCheapest(List<Pendrive> penDriveList){
        Pendrive cheapestPD = penDriveList.get(0);
        for (Pendrive pd: penDriveList){
            if (pd.isCheaperThan(cheapestPD)){
                cheapestPD = pd;
            }
        }
        return cheapestPD;
    }

    public void risePriceWhereCapacity(List<Pendrive> penDriveList, int percent, int capacity){
        for (Pendrive pd: penDriveList){
            if (pd.getCapacity() == capacity){
                pd.risePrice(percent);
            }
        }
    }
}
