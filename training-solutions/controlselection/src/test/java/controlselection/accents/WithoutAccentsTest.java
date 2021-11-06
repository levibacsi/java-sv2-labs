package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutAccentsTest {

    @Test
    void convertToCharWithoutAccents() {
        WithoutAccents withoutAccents = new WithoutAccents();
        assertEquals('a', withoutAccents.convertToCharWithoutAccents('á'));
        assertEquals('b', withoutAccents.convertToCharWithoutAccents('b'));
    }
}