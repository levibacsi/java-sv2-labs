package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> trooperList = new ArrayList<>();

    public List<Trooper> getTroopers(){
        return trooperList;
    }

    public void addTrooper (Trooper trooper){
        if (trooper == null) {
            throw new IllegalArgumentException("Trooper must not be null.");
        }
        trooperList.add(trooper);
    }

    public void moveClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Target must not be null");
        }
        Trooper closest = findClosestTrooper(target);
        if (closest != null) {
            moveTrooper(closest, target);
        }
    }

    public void moveTrooperByName (String name, Position target){
        Trooper trooper = findTrooperByName(name);
        if (trooper != null){
            moveTrooper(trooper, target);
        }
    }

    private Trooper findTrooperByName(String name) {
        for (Trooper trooper : trooperList) {
            if (trooper.getName().equals(name)) {
                return trooper;
            }
        }
        return null;
    }

    private Trooper findClosestTrooper(Position target) {
        if (trooperList.isEmpty()) {
            return null;
        }
        Trooper closest = trooperList.get(0);
        for (Trooper trooper : trooperList) {
            if (trooper.distanceFromTarget(target) < closest.distanceFromTarget(target)) {
                closest = trooper;
            }
        }
        return closest;
    }

    private void moveTrooper (Trooper trooper, Position target){
        trooper.changePosition(target);
    }

}
