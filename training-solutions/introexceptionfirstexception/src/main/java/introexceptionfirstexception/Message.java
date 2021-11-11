package introexceptionfirstexception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Message {
    public static void main(String[] args){

        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32", "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");
        List<Integer> codedNumbers = new ArrayList<>();
        for (String numberList: codedMessage) {
            codedNumbers.add(Integer.parseInt(numberList));
        }

        List<Character> codedCharacters = new ArrayList <>();
        for (int characters: codedNumbers){
            codedCharacters.add((char)characters);
        }

        System.out.println(codedCharacters);

        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122", "101", "110", "101", "116", "46");
        List<Integer> anotherCodedNumbers = new ArrayList<>();
        for (String anotherNumberList: anotherCodedMessage) {
            anotherCodedNumbers.add(Integer.parseInt(anotherNumberList));
        }

        List<Character> anotherCodedCharacters = new ArrayList <>();
        for (int characters: anotherCodedNumbers){
            anotherCodedCharacters.add((char)characters);
        }

        System.out.println(anotherCodedCharacters);

        }
}
//