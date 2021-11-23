package algorithmsdecision.words;

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> wordList, String word){
        for (String s: wordList){
            if (s.length() > word.length()){
                return true;
            }
        }
        return false;
    }
}
