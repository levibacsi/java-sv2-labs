package grammar;

public class Grammar {
    public static void main(String[] args) {
        Verb verbPhrasal = new PhrasalVerb("üt", "meg");
        Verb verbPhrasalWithSuffix = new PhrasalVerbWithSuffix("vág", "ki", "ni");

        Preposition prepPhrasal =new PhrasalVerb("rúg", "be");
        Preposition prepPhrasalWithSufffix = new PhrasalVerbWithSuffix("rúg", "ki", "ás");

        PhrasalVerb phrasalVerb = new PhrasalVerb("lő", "szét");
        PhrasalVerb phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("lő", "vissza", "tt");

        Suffix suffixPhrasal = new PhrasalVerbWithSuffix("számol", "le", "unk");

        PhrasalVerbWithSuffix pvs = new PhrasalVerbWithSuffix("számol", "el", "tok");

        System.out.println(verbPhrasal.getWord());
        System.out.println(verbPhrasalWithSuffix.getWord());
        System.out.println(prepPhrasal.getPreposition() + " " + prepPhrasal.getWholeWord());
        System.out.println(prepPhrasalWithSufffix.getPreposition() + " " + prepPhrasalWithSufffix.getWholeWord());
        System.out.println(prepPhrasal.getPreposition() + " " + prepPhrasal.getWholeWord());
        System.out.println(phrasalVerb.getPreposition() + " " + phrasalVerb.getWord() + " " + prepPhrasal.getWholeWord());
        System.out.println(prepPhrasalWithSufffix.getPreposition() + " " + prepPhrasalWithSufffix.getWholeWord());
        System.out.println(phrasalVerbWithSuffix.getPreposition() + " " + phrasalVerbWithSuffix.getWord() + " " + phrasalVerbWithSuffix.getWholeWord());
        System.out.println(suffixPhrasal.getSuffix());
        System.out.println(pvs.getPreposition()  + " " + pvs.getWord()  + " " + pvs.getSuffix() + " " + pvs.getWholeWord());
    }
}
