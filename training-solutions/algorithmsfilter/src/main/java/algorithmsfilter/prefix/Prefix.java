package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;

public class Prefix {
    public List<String> getWordsStartWith(List<String> words, String prefix){
        List<String> wordList = new ArrayList<>();
        for (String w: words){
            if (w.startsWith(prefix)){
                wordList.add(w);
            }
        }
        return wordList;
    }
}
