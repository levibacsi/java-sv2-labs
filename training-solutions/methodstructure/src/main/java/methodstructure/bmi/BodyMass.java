package methodstructure.bmi;

public class BodyMass {
    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBodyMassIndex(){
        return weight / (height * height);
    }

    public BmiCategory getBody(){
        BmiCategory bmi;
        if (getBodyMassIndex() < 18.5) {
            bmi = BmiCategory.UNDERWEIGHT;
        }
        else if (getBodyMassIndex() > 25){
            bmi = BmiCategory.OVERWEIGHT;
        } else {
            bmi = BmiCategory.NORMAL;
        }
        return bmi;
    }

    public boolean isThinnerThan(BodyMass other){
        return other.getBodyMassIndex() > this.getBodyMassIndex();
    }
}
