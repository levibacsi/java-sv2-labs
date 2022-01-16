package collectionsset;

import java.util.*;

public class QuestionGame {
    private List<RightAnswer> rightAnswers = new ArrayList<>();
    private Random rnd = new Random();

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public Set<String> drawWinners() {
        Set<String> winners = new HashSet<>();

        while (winners.size() < 5){
            if (rightAnswers.isEmpty()){
                throw new IllegalArgumentException("Not enough right answers!");
            }
            int i = rnd.nextInt(rightAnswers.size());
            winners.add(rightAnswers.get(i).getName());
            rightAnswers.remove(i);
        }
        return winners;
    }
}
