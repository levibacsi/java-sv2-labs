package interfacedefaultmethods.cloth;

public interface Square {
    default int getNumberOfSides(){
        return 4;
    }

    default double getLengthOfDiagonal(){
        return Math.sqrt(getSide() * getSide() * 2);
    }

    default double getPerimeter(){
        return getSide() * 4;
    }

    default double getArea(){
        return getSide() * getSide();
    }

    double getSide();
}
