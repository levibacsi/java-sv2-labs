package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character{
    public AxeWarrior(Point position, Random random) {
        super(position, random);
    }

    private int getActualSecondaryDamage(){
        return getRandom().nextInt(2 * getActualPrimaryDamage());
    }

    public void secondaryAttack(Character enemy){
        Point point = new Point(enemy.getPosition().getX(), enemy.getPosition().getY());
        if (point.distance(this.getPosition()) <= 2){
            hit(enemy, getActualSecondaryDamage());
        }
    }
}
