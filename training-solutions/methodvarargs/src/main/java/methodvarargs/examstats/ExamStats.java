package methodvarargs.examstats;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints){
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results){
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty.");
        }
        int overLimit = 0;
        for (int r: results){
            if (r >= maxPoints * (limitInPercent/100.0)){
                overLimit++;
            }
        }
        return overLimit;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results){
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty.");
        }
        for (int r: results){
            if (r < maxPoints * (limitInPercent/100.0)){
                return true;
            }
        }
        return false;
    }
}
