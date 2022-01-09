package exceptionmulticatch.converter;

public class AnswerStat {
    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public boolean[] convert(String string){
        try {
            return binaryStringConverter.binaryStringToBooleanArray(string);
        }
        catch (NullPointerException | IllegalArgumentException ex) {
            throw new InvalidBinaryStringException(ex);
        }
    }

    public int answerTruePercent(String answers){
        boolean[] answersBool = binaryStringConverter.binaryStringToBooleanArray(answers);
        int trueAnswers = 0;
        for (Boolean answer : answersBool) {
                if (Boolean.TRUE.equals(answer)) {
                    trueAnswers++;
                }
            }
        return trueAnswers * 100 / answersBool.length;
    }
}
