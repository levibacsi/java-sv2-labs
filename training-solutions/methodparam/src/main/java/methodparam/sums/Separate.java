package methodparam.sums;

import java.util.List;

public class Separate {
    private double positive;
    private double negative;

    public Separate(double positive, double negative) {
        this.positive = positive;
        this.negative = negative;
    }

    public double getPositive() {
        return positive;
    }

    public void setPositive(double positive) {
        this.positive = positive;
    }

    public double getNegative() {
        return negative;
    }

    public void setNegative(double negative) {
        this.negative = negative;
    }

    @Override
    public String toString() {
        return "Separate{" +
                "positive=" + positive +
                ", negative=" + negative +
                '}';
    }
}
