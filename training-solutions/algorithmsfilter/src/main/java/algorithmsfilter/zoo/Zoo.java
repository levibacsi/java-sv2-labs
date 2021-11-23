package algorithmsfilter.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animalsList = new ArrayList<>();

    public Zoo(List<Animal> animalsList) {
        this.animalsList = animalsList;
    }

    public List<Animal> getAnimalsList (){
        return animalsList;
    }

    public void addAnimal(Animal animal){
        animalsList.add(animal);
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs){
        List<Animal> animalsWithNumberOfLegsGivenList = new ArrayList<>();
        for (Animal a: animalsList){
            if (numberOfLegs == a.getNumberOfLegs()){
                animalsWithNumberOfLegsGivenList.add(a);
            }
        }
        return animalsWithNumberOfLegsGivenList;
    }
}
