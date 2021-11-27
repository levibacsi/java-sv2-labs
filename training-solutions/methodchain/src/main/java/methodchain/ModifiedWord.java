package methodchain;

import java.util.Locale;

public class ModifiedWord {

    public String modifySb (String word){
        String s = word.toUpperCase();
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0)).append("x").append(s.charAt(2)).append("y");
        return sb.toString();
    }

    public String modify(String word){
        char secondChar = word.toUpperCase().charAt(1);
        return word.toUpperCase().substring(0,3).replace(secondChar, 'x').concat("y");
    }
}
