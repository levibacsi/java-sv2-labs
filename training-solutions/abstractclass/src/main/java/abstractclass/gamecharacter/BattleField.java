package abstractclass.gamecharacter;

public class BattleField {
    private int round;

    public int getRound() {
        return round;
    }

    private boolean oneHit(Character attacker, Character defender){
        if (attacker.isAlive() && defender.isAlive()) {
            attacker.primaryAttack(defender);
            attacker.secondaryAttack(defender);
        }
        return attacker.isAlive() && defender.isAlive();
    }
    public Character fight(Character one, Character other){
        while (one.isAlive() && other.isAlive()) {
            oneHit(one, other);
            oneHit(other, one);
            round++;
        }
        if (one.isAlive()){
            return one;
        }
    return other;
    }
}
