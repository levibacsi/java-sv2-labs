package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {
    public Trainer getTrainerWithMaxAge(List<Trainer> trainers){
        int maxAge = 0;
        Trainer oldest = trainers.get(0);
        for (Trainer t: trainers){
            if (t.getAge() > maxAge){
                maxAge = t.getAge();
                oldest = t;
            }
        }
        return oldest;
    }
}
