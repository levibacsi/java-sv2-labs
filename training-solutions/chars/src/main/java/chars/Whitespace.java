package chars;

public class Whitespace {
    public String makeWhitespaceToStar(String text) {
        char [] characters = text.toCharArray();
        for (int i = 0; i < characters.length; i++){
            if (Character.isWhitespace(characters[i])) {
                characters[i] = '*';
            }
        }
        String newText = new String(characters);
        return newText;
    }

    public static void main(String[] args) {
        Whitespace whitespace = new Whitespace();
        System.out.println(whitespace.makeWhitespaceToStar("One two"));
    }
}

