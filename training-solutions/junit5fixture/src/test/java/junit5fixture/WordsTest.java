package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {
    private Words words;

    @BeforeEach
    void setUp() {
        words = new Words();
        words.addWord("computer");
        words.addWord("bandage");
        words.addWord("quiz");
        words.addWord("query");
        words.addWord("bandit");
        words.addWord("bantam");
        words.addWord("vantage");

    }

    @Test
    void testGetWordsStartWith() {
        List<String> expected = Arrays.asList("bandage", "bandit", "bantam");
        words.getWordsStartWith("ban");

        assertEquals(expected, words.getWords());
    }

    @Test
    void testGetWordsWithLength() {
        List<String> expected = Arrays.asList("bandit", "bantam");
        words.getWordsWithLength(6);

        assertEquals(expected, words.getWords());
    }
}
