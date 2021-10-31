package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        System.out.println(new Name("Johnson", "Magic", "Earvin", Title.MR).concatNameWesternStyle());
        System.out.println(new Name("Rigby", null, "Eleanor", Title.MS).concatNameWesternStyle());

        System.out.println(new Name("Sipos", "F.", "Tamás", Title.MR).concatNameHungarianStyle());
        System.out.println(new Name("Nemes", "Nagy", "Ágnes", null).concatNameHungarianStyle());
        System.out.println(new Name("Gombos", "", "Kati", Title.MS).concatNameHungarianStyle());
    }
}
