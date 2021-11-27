package methodpass.troopers;

public class Position {
    private final double posX;
    private final double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double distanceFrom (Position position){
        if (position == null) {
            throw new IllegalArgumentException("Cannot calculate distance from unknown position");
        }
        return Math.sqrt((this.posX - position.posX) * (this.posX - position.posX) + (this.posY - position.posY) * (this.posY - position.posY));

    }
}
