package lambda;

public class Sapling {
    private String species;
    private int height;

    public Sapling(String species, int height) {
        this.species = species;
        this.height = height;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void cut(int maxHeight){
        if (height > maxHeight){
            height = maxHeight;
        }
    }
}
