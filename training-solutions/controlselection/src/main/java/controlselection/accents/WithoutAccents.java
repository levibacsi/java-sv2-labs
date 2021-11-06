package controlselection.accents;

public class WithoutAccents {
    public static final String HUN = "áéíóöőúüűÁÉÍÓÖŐÚÜŰ";

    public static final String ENG = "aeiooouuuAEIOOOUUU";

    public char convertToCharWithoutAccents(char c) {
        int i = HUN.indexOf(c);
        if (i >= 0) {
            return ENG.charAt(i);
        } else {
            return c;
        }
    }
}

