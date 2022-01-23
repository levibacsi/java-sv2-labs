package lambdaoptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Club {
    private List<Member> members = new ArrayList<>();

    public Club(List<Member> members) {
        this.members = members;
    }

    public Optional<Member> findFirst(Predicate<Member> predicate){
        for (Member m: members)
            if (predicate.test(m)){
                return Optional.of(m);
            }
        return Optional.empty();
    }

    public Optional<Double> averageNumberOfSkills(){
        if (members.size() == 0){
            return Optional.empty();
        }
        double avg = members.stream()
                    .mapToInt(member -> member.getSkills().size())
                    .summaryStatistics().getAverage();
            return Optional.of(avg);
    }
}
