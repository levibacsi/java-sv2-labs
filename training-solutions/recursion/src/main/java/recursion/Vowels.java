package recursion;

public class Vowels {

    private String vowels = "aáeéiíoóöőuúüűAAEÉIÍOÓÖŐUÚÜŰ";

    public int getNumberOfVowels(String word) {
        if (word.length() == 0) {
            return 0;
        }
        if (vowels.indexOf(word.charAt(0)) >= 0) {
            return 1 + getNumberOfVowels(word.substring(1));
        } else {
            return getNumberOfVowels(word.substring(1));
        }
    }
}
