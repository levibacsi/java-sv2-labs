package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToConsonantTest {

    @Test
    void toCons() {
        ToConsonant toConsonant = new ToConsonant();
        assertEquals('b', toConsonant.toCons('a'));
        assertEquals('b', toConsonant.toCons('b'));
    }
}